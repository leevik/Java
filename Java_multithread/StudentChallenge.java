class WhiteBoard {
    String text;
    int numberOfStudents=0;
    int counter = 0;
    public void attendance(){
        numberOfStudents++;
    }

    synchronized public void write(String v) {
        System.out.println("Ope kirjottaa"+v);
        while (counter!=0)
            try {wait();} catch (Exception e) {
            }
        text = v;
        counter=numberOfStudents;
        notifyAll();
    }

    synchronized public String read() {
        while (counter==0)try {wait();} catch (Exception e) {}
        String x = text;
        counter--;
        if(counter==0){
            notify();
        }
        return x;
    }

}
class Teacher extends Thread {
    WhiteBoard wb;

    String notes[]={"Java is language", "it is OOPs", "It is platform independent", "It supports Thread","end"};
    public Teacher(WhiteBoard w){
        wb = w;
    }
    public void run() {
        for(int i=0;i<notes.length;i++)
            wb.write(notes[i]);
        }
    }

class Student extends Thread {
    WhiteBoard wb;
    String name;

    public Student(String n, WhiteBoard w){
        name=n;
        wb=w;
    }
    public void run() {
        String text;
        wb.attendance();
        do{
            text=wb.read();
            System.out.println(name + " Reading " + text);
            System.out.flush();
        }while(!text.equals("end"));
    }
}

public class StudentChallenge {
    public static void main(String[] args) {
        WhiteBoard wb = new WhiteBoard();
        Teacher t = new Teacher(wb);
        Student s1 = new Student("jani", wb);
        Student s2 = new Student("joni", wb);
        Student s3 = new Student("janne", wb);
        Student s4 = new Student("jape", wb);

        t.start();
        s1.start();
        s2.start();
        s3.start();
        s4.start();
    }
}

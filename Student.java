public class Student {
    public int roll;
    public String name;
    public String course;
    public int m1,m2,m3;



    public int total(){
        return m1+m2+m3;
    }

    public double average(){
        return (float)total()/3;
    }

    public char grade(){
        if(average()>=60)
            return 'A';
        else
            return 'B';
    }
    
}

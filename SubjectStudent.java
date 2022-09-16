class Subject{
        private int subID;
        private String name;
        private int maxMarks;
        private int marksObtain;

        public Subject(int subID, String name, int maxMarks){
            this.subID = subID;
            this.name = name;
            this.maxMarks = maxMarks;
        }
        public String toString(){
            return "\nSubject ID:"+subID+"\nName :"+name+"\nMarks Obtained: "+marksObtain;
        }
        public int getMaxM(){
            return maxMarks;
        }
        public int getMarks(){
            return marksObtain;
        }
        public int getSID(){
            return subID;
        }
    }

class Student{
        private int rollNo;
        private String name;
        private String dept;
        private String subjects;


        public Student(int rn, String n, String d){
            rollNo = rn;
            name = n;
            dept = d;
        }
        public int getRollNo(){
            return rollNo;
        }
        public String getname(){
            return name;
        }
        public String getdept(){
            return dept;
        }
        public String getSubjects(){
            return subjects;
        }
        public void setSubjects(String s){
            subjects = s;
        }
        
        
    }
    public class SubjectStudent {
    public static void main(String[] args) {
        Subject subs[]= new Subject[3];
        subs[0]=new Subject(3, "kauppis", 3);
        subs[1]=new Subject(4, "kauppista", 5);
        subs[2]=new Subject(5, "kauppisasss", 7);
        for (Subject s:subs)
        System.out.println(s);
        /* Student s = new Student(23, "Aatu", "Kauppis");
        s.setSubjects("laskentatoimi");
        System.out.println(s.getRollNo()); */
    }
}

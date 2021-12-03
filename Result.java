import java.util.Scanner;

class Result
{

public static void main(String arg[])
{

String name, fname,rollno;    int i, Gtotal=0,count=0;
String subject[] = { "Java", "Operating System", "Information Security","Gender and Ethics","Laplace","Dymola"}; String subcode[]= { "JV-102","OS-103","IS-101","GE-103","LP-101","DM-101"};
int midmarks[]= new int[6];
int semmarks[]= new int[6];
Scanner s = new Scanner(System.in);
System.out.println("\t Enter your Full Name: ");
name = s.nextLine();
System.out.println("\t Enter your Father Name:");
fname = s.nextLine();
System.out.println("\t Enter your Roll Number:");
rollno = s.nextLine();
for(i=0;i<6;i++)
{
    System.out.println("\t Enter Midterm Marks for: "+subject[i]+":");
    midmarks[i] = s.nextInt();
}
 System.out.println("\n\t\t\tOK NOW");
for(i=0;i<6;i++)
{
    System.out.println("\t Enter Final Exam Marks for: "+subject[i]+":");
    semmarks[i] = s.nextInt();
}

  System.out.println("\t\t\t\t\tYOUR RESULT\n");
  System.out.println("\t\t College:\t"+"Centurion Univercity of Technology and Management BBSR");
  System.out.print("\n\t\t Name:          " +name);
  System.out.println("\t\tFather Name: \t" +fname);
  System.out.println("\t\t Roll Number: \t" +rollno);
  System.out.println("\n\t\t "+"Subcode"+"\tmarks1"+"\tmarks2"+"\tTotal");
for(i=0;i<6;i++)
{
       if(((midmarks[i])+(semmarks[i])) >=40)
       {
        System.out.println("\t\t "+subcode[i]+"\t\t "+midmarks[i]+"\t"+semmarks[i]+"\t"+((midmarks[i])+(semmarks[i])));
       }
       else
      {
      System.out.println("\t\t "+subcode[i]+"\t\t "+midmarks[i]+"\t"+semmarks[i]+"\t"+((midmarks[i])+(semmarks[i]))+"*");
      count++;
      }
      Gtotal = (Gtotal + ((midmarks[i])+(semmarks[i])));
}
if(count >0)
{
 System.out.println("\n\t\t Grand Total:\t"+Gtotal+"\tResult: \tFAIL");
}
else
{
System.out.println("\n\t\t Grand Total:\t"+Gtotal+"\tResult:\tPASS");
}
}
}

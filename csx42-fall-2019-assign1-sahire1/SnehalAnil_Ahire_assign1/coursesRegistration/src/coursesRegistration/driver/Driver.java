package coursesRegistration.driver;
import coursesRegistration.util.FileProcessor;
import java.io.FileNotFoundException;
import coursesRegistration.util.student;
import coursesRegistration.util.course;
import courseRegistration.scheduler.Algorithm;
import coursesRegistration.util.Results;

/**
 * @author John Doe
 *
 */
public class Driver {
	public static void main(String[] args) throws FileNotFoundException {

		
		if (args.length != 2 || args[0].equals("${arg0}") || args[1].equals("${arg1}") ) {

			System.err.println("Error: Incorrect number of arguments. Program accepts 2 argumnets.");
			System.exit(0);
		}
		
		//FileProcessor f=new FileProcessor();
		course c=new course();
		student s=new student();
		//Read 1st file
		
		//System.out.println("this is the filename"+args[0]);
		int a=c.readfile(args[0]);
		FileProcessor f=new FileProcessor();
		
		course[] co=f.readfile1(args[0],a);
		int b=s.readfile(args[1]);
		//student so[]=new student[b];
		student[] so=f.readfile2(args[1],b);
		for(int i=0;i<so.length;i++)
		{
			so[i].init();
		}
		
		//so.init();
		Algorithm al=new Algorithm();
		
		al.run(so,co,b,a);
		
		
		Results r=new Results();
		
		
	int srateIn=r.cal(so);
	float savg=(float)srateIn/b;
	r.getsavg(savg);
	r.write(args[2],so);
		r.write1(so);
		
	}
}

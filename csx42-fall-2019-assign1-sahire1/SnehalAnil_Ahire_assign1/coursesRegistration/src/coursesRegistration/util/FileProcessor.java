package coursesRegistration.util;
//import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
//import org.apache.commons.lang3.ArrayUtils;
public class FileProcessor 
{
	
	public course[] readfile1(String courseInfo,int linesIn)  
	{
		course[] co=new course[linesIn];
		String name;
		int cap;
		int time;
	
		  //CITED CODE https://www.journaldev.com/709/java-read-file-line-by-line
		BufferedReader reader;
		try {
					reader = new BufferedReader(new FileReader("courseInfo.txt"));
					String line = reader.readLine();
					//int i=1;
					int conum=0;
					while (line != null) 
					{
						co[conum]=new course();
						//System.out.println(line);
						// read next line
						//L1 has cname
										String[] l1 = line.split(" ");
										//check output
									//L2 has capacity and timing
										String[] l2=l1[1].split(";");
										
										for(int i=0;i<l2.length;i++)
										{
										  
										//System.out.println(i);
										if(i==0)
										   {  //System.out.println(l2[i]);
											   l2[i]=l2[i].substring(9,11);
											   cap=Integer.parseInt(l2[i]);
											   if(cap<=0)
											   {
												   System.out.println("You have input capacity as none");
											   }
											   co[conum].capacity=cap;
											 
										   }
										   if(i==1)
										   {
											   l2[i]=l2[i].substring(13,14);
											   time=Integer.parseInt(l2[i]);
											   	if(time<0)
											   {
												   System.out.println("You have input time as less than 0");
											   }
											   co[conum].ctime=time;
											  
										   }
										   //*/
											//
											
										}
										
										for(int j=0;j<l1.length;j++)
										{
										//name=l1[j].charAt(0);
										if(j==0)
										{
											name=l1[j];
											co[conum].cname=name;
											int ascii =(int)name.charAt(0);
											
											if(ascii>64 && ascii <74)
											{
												
											}
											else
											{
												System.out.println("Input value is not a valid course name, give value between A and I ");
											}
											//System.out.println(name);
											//System.out.println(l1[j]);
										}
											
											
										}
										//co[conum].course(cap,time,name);
													line = reader.readLine();
													conum++;

					}
			
			reader.close();
			
			} catch (IOException e) 
				{
					e.printStackTrace();
				}
				finally
				{
					
				}
			 
				
		return co;
				//return 0;
	}
	
	
	
	
	//read student pref course
	public student[] readfile2(String student_coursePrefs,int linesIn)  
	{
		student so[]=new student[linesIn];
		int id;
		String lev;
		String cf;
	//CITE CODE https://www.tutorialspoint.com/java/java_files_io.htm
	      //FileInputStream in = null;
		  //System.out.println(input);
		  //CITE CODE https://www.journaldev.com/709/java-read-file-line-by-line
		BufferedReader reader;
		try {
					reader = new BufferedReader(new FileReader("student_coursePrefs.txt"));
					String line = reader.readLine();
					//int i=1;
					int sonum=0;
					while (line != null) 
					{
						
										so[sonum]=new student();
										
										
										String[] l1 = line.split(" ");
										//check output
									//L2 has capacity and timing
										String[] l2=l1[1].split("::");
										
										
										
										for(int i=0;i<l1.length;i++)
										{
											if(i==0)
										{
											//ID IS HERE
											id=Integer.parseInt(l1[i]);
										//	System.out.println(name);
											if(id>=100 && id<=999)
										{
											
										}else
										{
											System.out.println("Input is not 3 digit");
										}
											so[sonum].sid=id;
											//System.out.println(l1[j]);
										}
											
										}
										for(int j=0;j<l2.length;j++)
										{
											if(j==0)
											{
												cf=l2[j];
												cf=cf.replace(",", "");
												if(cf.length()!=9)
												{
													System.out.println("More than 9 preferences are given");
												}
												so[sonum].pref=cf;
												//System.out.println(cf);
												//COURSE PREF
											}
											if(j==1)
											{
												lev=l2[j];
												if(lev.equals("THIRD_YEAR") || lev.equals("SECOND_YEAR") || lev.equals("FIRST_YEAR"))
												{
													
												}
												else
												{
												System.out.println("Input level is not THIRD_YEAR OR SECOND_YEAR OR FIRST_YEAR");	
												}
												so[sonum].level=lev;
												
												//System.out.println(lev);
												//LEVEL
											}
											
											//System.out.println(l2[j]);
											
										}
										
													line = reader.readLine();
												sonum++;
					}
			
			reader.close();
			
			
			} catch (IOException e) 
				{
					e.printStackTrace();
				}
				finally
				{
					
				}
			 
				
		return so;
				//return 0;
	}
	
	
	
	
}



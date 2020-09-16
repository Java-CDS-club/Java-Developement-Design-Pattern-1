package coursesRegistration.util;
import coursesRegistration.util.course;
import coursesRegistration.util.student;
import java.io.FileWriter;  

public class Results implements FileDisplayInterface,StdoutDisplayInterface{
	int srate=0;
	float savg;
	public void getsavg(float savgIn)
	{
		savg=savgIn;
	}
	public void write(String nameIn,student[] so)
	{
		
		try{    
           FileWriter fw=new FileWriter("C:/apache-ant-1.10.7/bin/SnehalAnil_Ahire_assign1/coursesRegistration/src/registration_results.txt");    
		   for(int i=0;i<so.length;i++)
		{
			String temp=so[i].c.replace("null","");
           fw.write(so[i].sid+":");
		   for(int j=0;j<temp.length();j++)
				{
					if(j==temp.length()-1)
				{
					fw.write(temp.charAt(j)+":: SatisfactionRating=");
				}
				else
				{
					fw.write(temp.charAt(j)+",");
				}
					
					
				
				}
		   
		   

		  // fw.write(temp+"\n");   
		   fw.write(so[i].sat+"\n");
		}
		fw.write("AverageSatisfactionRating="+savg);
		
           fw.close();    
          }catch(Exception e){System.out.println(e);} 
		
		
	}	
	public void write1(student[] so)
	{
		
		for(int i=0;i<so.length;i++)
		{
		//so[i].c
		System.out.print(so[i].sid+" : ");
		String temp=so[i].c.replace("null","");
		for(int j=0;j<temp.length();j++)
		{
			
				//System.out.println(",");
				if(j==temp.length()-1)
				{
					System.out.print(temp.charAt(j)+" :: SatisfactionRating= ");
				}
				else
				{
					System.out.print(temp.charAt(j)+",");
				}
		}
		//System.out.println(temp); 
		System.out.println(so[i].sat);
        
		
		}
		System.out.println("AverageSatisfactionRating="+savg);
		
	}
	public int cal(student[] so)
	{
		 int[][] intpref=new int[so.length][9];
		
		
		float savg=0;
		for(int i=0;i<so.length;i++) //pref
		{
			for(int j=0;j<9;j++) //pref
		{
			if(j==0)
			{
			intpref[i][j]=9;
			}
			
			if(j==1)
			{
			intpref[i][j]=8;
			}
			if(j==2)
			{
			intpref[i][j]=7;
			}
			if(j==3)
			{
			intpref[i][j]=6;
			}
			if(j==4)
			{
			intpref[i][j]=5;
			}
			if(j==5)
			{
			intpref[i][j]=4;
			}
			if(j==6)
			{
			intpref[i][j]=3;
			}
			if(j==7)
			{
			intpref[i][j]=2;
			}
			if(j==8)
			{
			intpref[i][j]=1;
			}
			
			
		}	
		}
		
		for(int i=0;i<so.length;i++) //pref
		{
			
				 String temp=so[i].c.replace("null","");
						
					//System.out.println(temp);	
					for(int j=0;j<9;j++) //pref
				{
					for(int k=0;k<3;k++)
					{
						
						
						if((so[i].pref.charAt(j))==(temp.charAt(k)))
						{
							
							so[i].sat=so[i].sat+intpref[i][j];
							
							srate=srate+intpref[i][j];
						}
						
						//break;
					}
					
				}	//}
		
		}
		return srate;
	}
}

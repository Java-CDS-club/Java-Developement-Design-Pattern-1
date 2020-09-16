package courseRegistration.scheduler;
import coursesRegistration.util.course;
import coursesRegistration.util.student;




public class Algorithm
{
   
   public int check(char pref, course co,student so)
	{
		
			if(pref==co.cname.charAt(0))
			{
				if(co.capacity!=0)
				{
					for(int j=0;j<3;j++)
					{
						if(so.t[j]==co.ctime)
						{
							
							//System.out.println("no");
							return 0;
						}
					}
				}
				else
				{	//System.out.println("no");
			return 0; 
				}
				//assign
			
				so.c=so.c+co.cname;
				co.capacity=co.capacity-1; //capacity reduced
				for(int k=0;k<3;k++)
				{
					if(so.t[k]==0)  //time alloted
					{
						so.t[k]=co.ctime;
					}
				}
				
				
				return 1;
			}
			
			
		return 0;
	}
	   
 
   
	public void run(student[] so, course[] co, int b, int a)
	{ 
	
		for(int i=0;i<b;i++) //students
		{ //System.out.println("HI");
		int count=0;
			if(so[i].level.equals("THIRD_YEAR"))
			{ 
				for(int j=0;j<9;j++) //for so.pref
				{ 
					for(int k=0;k<a;k++) //for co
					{
					
					int r=check(so[i].pref.charAt(j),co[k],so[i]);
					
					if(r==1)
						{
						//loop twice	
						count++;
						//System.out.println(count);
						}
						if(count==3)
						{
							//i++;
							//System.out.println(i);
							break;
						}
						
					
					}
					
				}
				//}
				
				
			}
			
		}	



		for(int i=0;i<b;i++) //students
		{ 
		
		int count=0;
			if(so[i].level.equals("SECOND_YEAR"))
			{ 
				for(int j=0;j<9;j++) //for so.pref
				{ 
					for(int k=0;k<a;k++) //for co
					{
					
					int r=check(so[i].pref.charAt(j),co[k],so[i]);
					
					if(r==1)
						{
						//loop twice	
						count++;
						//System.out.println(count);
						}
						if(count==3)
						{
							
							break;
						}
						
					
					}
					
				}
				//}
				
				
			}
			//break;
		}	
		
		
		
		//FIRST_YEAR
		// i=0;
	//while(i!=b)
		for(int i=0;i<b;i++) //students
		{ //System.out.println("HI");
		int count=0;
			if(so[i].level.equals("FIRST_YEAR"))
			{ 
				for(int j=0;j<9;j++) //for so.pref
				{ 
					for(int k=0;k<a;k++) //for co
					{
					
					int r=check(so[i].pref.charAt(j),co[k],so[i]);
					
					if(r==1)
						{
						//loop twice	
						count++;
						//System.out.println(count);
						}
						if(count==3)
						{
							//i++;
							//System.out.println(i);
							break;
						}
						
					
					}
					
				}
				//}
				
				
			}
			//break;
		}	
		
		
	}

}
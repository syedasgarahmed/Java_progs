import java.util.*;
class AdviSerices 
{
	static int u,bg,bx;
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int ch;
		String uname,passwd,uid,bid;
		String users[]={"Abc.Ltd","Pqr.Ltd","xyz.ltd"};
		String Bringers[]={"James","Jack"};
		String boxes[]={"Yalahanka","Hebbal","Electronic city"};
innerloop1:
		for(;;)
		{
			int ch1,ch2,ch3,ch4;
			System.out.println("What is your Role..");
			System.out.println("1--> Admin\t2--> user\t3--> Bringer\t4-->exit");
			ch=sc.nextInt();u=0;bg=0;bx=0;
			switch(ch)
			{
				case 1:try
				{
					
				System.out.println("Enter username");
					   uname=sc.next();
					   while(!uname.equals("admin"))
						{
						   System.out.println("Enter correct Username");
						   uname=sc.next();
						}
						System.out.println("Enter password");
						passwd=sc.next();
						while(!passwd.equals("admin"))
						{
						System.out.println("!!  wrong password  !!\nEnter password again");
						passwd=sc.next();
						}
				
						for(;;)
						{
						System.out.println("----------------------------------Admin-panel---------------");
						System.out.println("1->List users\n2->List Bringers\n3->Locate boxes\n4-> Trace Bringer\n5->Logout");
						System.out.print("Your choice: ");
						ch1=sc.nextInt();
						switch(ch1)
						{
						case 1:for(String s:users)
							   System.out.println(s);
						break;
						case 2:for(String s:Bringers)
							   System.out.println(s);
						break;
						case 3:for(String s:boxes)
							   System.out.println(s);
						break;
						case 4:System.out.println("!! no bringer is active !!");
						break;
						case 5: continue innerloop1;
						//break;
						default:System.out.println("!!  wrong choice  !!");
						}
						}
							}
				catch (Exception e)
				{
				}
				break;
				case 2:try{
					System.out.println("Enter userid");
					   uid=sc.next();
					   System.out.println("Enter password");
					   passwd=sc.next();
					   while(!passwd.equals("1234"))
						{
						   System.out.println("!!  wrong password  !!\n enter password again");
							   passwd=sc.next();
						}
				//innerloop2:
						for(;;)
						{
							System.out.println("----------------------------- User-panel ------------------------");
							System.out.println("1->List myBoxes\n2->edit profile\n3->contact support\n4->Logout");
							ch2=sc.nextInt();
							switch(ch2)
							{
								case 1:if(bx<3)System.out.println(boxes[bx++]);
								   else bx=0;
								break;
								case 2:if(u<3){
								   System.out.println("Username:"+users[u++]);
							       System.out.println("password: 1**4");
							}
							else u=0;
							break;
							case 3: System.out.println("Advi group of companies");
						      System.out.println("Phone: +91123456789");
							  System.out.println("website: www.adviservices.com");
							  System.out.println("write to us: support@adviservices.in");
							 break;
								case 4: continue innerloop1;
						//break;
							default:System.out.println("!!  wrong choice  !!");break;
							}
						}
				}
				catch(Exception e){}
				break;
				case 3: try
				{
					
				System.out.println("Enter Bringers id");
					   bid=sc.next();
					   System.out.println("Enter password");
					   passwd=sc.next();
					   while(!passwd.equals("1234"))
						{
						   System.out.println("!!  wrong password  !!\n enter password again");
						   passwd=sc.next();
						}
				//innerloop3:
							for(;;)
							{
							System.out.println("----------------------------- Bringer-panel ------------------------");
							System.out.println("1->List Boxes near me\n2->edit profile\n3->contact support\n4->Logout");
							ch3=sc.nextInt();
							switch(ch3)
							{
								case 1:for(String bb:boxes)
								   System.out.println(bb);
								break;
								case 2:if(bg<3)
								{
									   System.out.println(Bringers[bg++]);
									   System.out.println("password: ***4");
								}
								else
									bg=0;
								break;
								case 3:System.out.println("Advi group of companies");
								      System.out.println("Phone: +91123456789");
									  System.out.println("website: www.adviservices.com");
									  System.out.println("write to us: support@adviservices.in");
							   break;
								case 4:continue innerloop1;
								//break;
								default:System.out.println("!!  wrong option  !!");
							}
						}
						}
				catch (Exception e)
				{
				}
				break;
				case 4: System.exit(0);
				break;
			}
		}
	}
}

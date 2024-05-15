import java.util.Scanner;

public class MT_02 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		int user_level = 0, com_level = 0;
		int level, result = 0;
		System.out.println("목표 계단높이를 입력하세요: ");
		level= s.nextInt();
		
		String myHand, comHand;
	    String win = "이겼습니다!";
	    String lose = "졌습니다!";
	    String draw = "비겼습니다!";
	    String my_result = lose;
	    
		while(true) 
		{
			while(true)
		    {
				System.out.print("나의 가위/바위/보 ==> ");
			    myHand = s.next();
			    if (myHand.equals("가위") || myHand.equals("바위") || myHand.equals("보")  )
			    	break;
			    System.out.println("가위/바위/보 중 하나를 내세요.");
		    }
			    	
		 
		    String[] hands = {"가위", "바위", "보"};
		    
		    int rnd = (int) (Math.random() * hands.length);
		    comHand = hands[rnd];
		    System.out.println("컴퓨터의 가위/바위/보 ==> " + comHand);
		    
		    if (myHand.equals("가위")) 
		    {
		        if (comHand.equals("가위"))
		        {
		        	my_result = draw; 
		            result = 0;
		        }
		        else if (comHand.equals("바위"))
		        {
		        	my_result = lose;
		        	result = -1;
		        }
		        else if (comHand.equals("보")) 
		        {
		        	my_result = win;
		        	result = 1;
		        }
		    }
		    
		    else if (myHand.equals("바위")) 
		    {
		    	     if (comHand.equals("가위"))
		    	     {
		    	    	 my_result = win;
		    	    	 result = 1;
		    	     }	 
		             else if (comHand.equals("바위"))
		             {	 
		            	 my_result = draw;
		            	 result = 0;
		             }	 
		             else if (comHand.equals("보"))
		             {	 
		    	         my_result = lose;
		    	         result = -1;
		             }    
		    	         
		    }
		    else if (myHand.equals("보")) 
		    {
		    	     if (comHand.equals("가위"))
		    	     {	 
		    	    	 my_result = lose;
		    	    	 result = -1;
		    	     }	 
		             else if (comHand.equals("바위"))
		             {	 
		            	 my_result = win;
		            	 result = 1;
		             }	 
		             else if (comHand.equals("보"))
		             {	 
		    	         my_result = draw;
		    	         result = 0;
		             }    
		    }          
		             
	
		    System.out.println(my_result);
			
            if (result ==1)
		    {
		        user_level ++;
		        com_level --;
		        if(com_level < 0)
		           com_level = 0;	
		    }
            else if (result == -1)
            {
            	user_level --;
		        com_level ++;
		        if(user_level < 0)
		           user_level = 0;	
            }	
            System.out.printf("User: %d, Com: %d\n", user_level, com_level);
            if(user_level == level)
            {
            	System.out.println("최종 승자는: User");
            	break;
            }
            else if (com_level == level)
            {
            	System.out.println("최종 승자는: Computer");
            	break;
            }
		    
		}
		s.close();
	}
}
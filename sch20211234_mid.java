import java.util.Scanner;
public class MT_01 
{
	public static void main(String[] args) 
	{
	Scanner s = new Scanner(System.in);
	
	String myHand, comHand;
    String win = "이겼습니다!";
    String lose = "졌습니다!";
    String draw = "비겼습니다!";
    String my_result = lose;
    while(!my_result.equals(win)) 
    {
    	if (my_result == win) 
    		break;
    	while (true)
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
	        	my_result = draw;
	        else if (comHand.equals("바위"))
	        	my_result = lose;
	        else if (comHand.equals("보"))
	        	my_result = win;
	    }
	    
	    else if (myHand.equals("바위")) 
	    {
	    	     if (comHand.equals("가위"))
	    	    	 my_result = win;
	             else if (comHand.equals("바위"))
	            	 my_result = draw;
	             else if (comHand.equals("보"))
	    	         my_result = lose;
	    	         
	    }
	    else if (myHand.equals("보")) 
	    {
	    	     if (comHand.equals("가위"))
	    	    	 my_result = lose;
	             else if (comHand.equals("바위"))
	            	 my_result = win;
	             else if (comHand.equals("보"))
	    	         my_result = draw;
	    	         
	    }
	             System.out.println(my_result);
	}
    s.close();
    }
}
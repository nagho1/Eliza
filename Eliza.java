import java.util.*;
public class Eliza
{
    private String name;
    private int thirty; //30 mins
    private int sixty;// 60 mins.
    private int overHour;//over an hour



    public void setTime(int newThirty, int newSixty, int newHour, String newYesNo)
    {
        if((newThirty >=30) || (newSixty >= 60) || (newHour >=60 && newHour <= 100))
        {
            thirty= newThirty;
            sixty = newSixty;
            overHour = newHour;
        }
        else
        {
            System.out.println("Error: Bad parameter in setTime.");
            System.exit(0);
        }

    }

    /**
     * ask function.
     */
    public void Ask()
    {
    	
    	
        Scanner keyboard = new Scanner(System.in);
        int count = 0;
        System.out.println("Great! The following questions are about the interview process you just went through.");
        System.out.println("How long did the interview take?");
        String wentWell = "Do you think it went well?";
        String remember = "Do you remember who you spoke with?";
        String whom = "Whom did you speak with?";
        String forget = "Did the interviewers forget to introduce themselves?";
       int input = keyboard.nextInt();
       if( (input> 0) && (input < thirty))
       {
            System.out.println(thirty);
            System.out.println("That's a pretty short interview...");
            System.exit(0);
       }
        if((input > thirty) && (input < sixty))//Default!! go ahead
        {

            String myAnswer;
            System.out.println(count);
            System.out.println(wentWell);//Do you think you did well?
            //Yes/no?
            myAnswer = keyboard.next();
            /*
             * Yes or no to did you do well is the same below!!
             */
            if(myAnswer.equalsIgnoreCase("yes") || myAnswer.equalsIgnoreCase("no"))
            {

                String doYouRemember;//do you remember who you spoke with variable answer?
                System.out.println(myAnswer);//prints the answer
                //ask more
                System.out.println(remember);//do you remember who you spoke with?
                doYouRemember = keyboard.next();//readin the variable for remember?

                if(doYouRemember.equals("yes"))//if yes...read in for yes...print
                {
                    String list;//variable for the list of names
                    System.out.println(whom);//prints the words for whom?
                    list = keyboard.next();//reads in next character
                    System.out.println(list);//prints list

                }
                if(doYouRemember.equalsIgnoreCase("no"))//Did they forget to introduce, since you said no?
                {
                    System.out.println(forget);
                }
            }


        }

        if(input > overHour)
        {
            System.out.println(overHour);
            System.out.println("That must've been brutal...");
            System.exit(0);
        }


    }
    /**
     * Say function
     */
    public void Say()
    {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is your name?");
        name = keyboard.nextLine();
        System.out.println(name + ", may I ask you a few questions?");
    }



    public static void main(String[] args)
    {
        //boolean here or equals method
        //call it
        Eliza testing = new Eliza();
        
        testing.setTime(30, 59, 100, "");
        testing.Ask();


    }    
}

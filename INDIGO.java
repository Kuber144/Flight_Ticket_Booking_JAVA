import java.util.*;//START OF CLASS WITH IMPORTING SCANNER FUNCTION
class INDIGO
{
    int n1,passengers,code,discount,flight,flight2;//declaration of instance variables
    String d1,d2,dep_date1,dep_date2,special,nm;
    double fare,fare2,tot_cost,tot_cost2;
    public static void main(String[] args)//using main method to call other functions
    {
        INDIGO objflight=new INDIGO();
        int x=objflight.flighttype();
        INDIGO objcompute=new INDIGO();
        if(x==1)
        objcompute.oneway();
        else
        objcompute.roundtrip();
        objcompute.snacks();
        objcompute.cancel();
        objcompute.display();
    }
    public int flighttype()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\t\t\t*** WELCOME TO INDIGO FLIGHT BOOKING WEBSITE ***\n");
        if(Math.random()<0.10)//it adds a small chance that if the flight is available or not
        {
            System.out.println("SORRY NO FLIGHTS AVAILABLE RIGHT NOW PLEASE TRY AGAIN LATER\n");
            System.exit(-1);
        }
        else
        {
            do
            {
            System.out.println("PLEASE ENTER THE TYPE OF FLIGHT YOU NEED\n");
            System.out.println("1 FOR ONE WAY \n2 FOR ROUND TRIP");//ASKING USER TO CHOOSE BETWEEN TYPES OF FLIGHTS
            n1=sc.nextInt();
            if(n1==1||n1==2)
            break;
            else
            System.out.println("WRONG OPTION ENTERED PLEASE TRY AGAIN");
            }while(n1!=1 && n1!=2);
        }
        return n1;
    }
    public void oneway()//IF USER CHOOSES 1 THE MAIN WILL CALL THIS FUNCTION
    {
           System.out.println("\f");//to clear output screen
           Scanner sc=new Scanner(System.in);
           System.out.println("WELCOME TO INDIGO'S ONE WAY FLIGHT TICKET BOOKING FACILITY\n");
           System.out.println("ENTER YOUR DEPARTURE");//ACCEPTING DETAILS FROM THE USER
           d1=sc.nextLine();
           System.out.println("ENTER YOUR DESTINATION");
           d2=sc.nextLine();
           System.out.println("ENTER NUMBER OF PASSENGERS");
           passengers=sc.nextInt();
           System.out.println("ENTER DEPARTURE DATE");
           dep_date1=sc.nextLine();
           dep_date1=sc.nextLine();
           System.out.println("ENTER RETURN DATE");
           dep_date2=sc.nextLine();
           System.out.println("IF YOU HAVE AVAILED ANY OF OUR SPECIAL SERVICES LIKE:\n");
           System.out.println("Armed Forces Personnel\n6E student\n6E Senior Citizen\nUnaccompanied Minor\n");
           System.out.println("THEN YOU WILL A DISCOUNT OF TEN PERCENT ON ALL OUR FLIGHTS\n");
           System.out.println("ENTER Y FOR YES OR ANY OTHER LETTER FOR NO");//ASKING IF THE USER HAS ANY SERVICES
           special=sc.next();
           if(special.equalsIgnoreCase("Y"))
           {
               double temp=0;
               do
               {
               System.out.println("TO GET THE DISCOUNT PLEASE ENTER THE CODE WE HAVE GIVEN YOU WHEN YOU GOT THIS SERVICE");
               code=sc.nextInt();
               while(code>0)//USING LOGIC FOR THE SPECIAL CODE THAT IS GIVEN TO THE USER
               {
                   double d=code%10;
                   temp=temp+d;
                   code=code/10;
               }
               if(temp%10==0)
               {
                   System.out.println("SUCCESS.YOUR CODE HAS BEEN SUCCESSFULLY PROCESSED\n");//OUTPUT IF THE CODE IS CORRECT
                   System.out.println("ENTER ANY LETTER TO CONTINUE");
                   String x=sc.next();//to add a delay and let the user see the result
                   discount=10;
               }
               else
               System.out.println("LOOKS LIKE THE CODE YOU ENTERED IS NOT CORRECT PLEASE TRY AGAIN");
               }while(discount!=10);//IT KEEPS ON GOING IN A LOOP TILL THE USER ENTERS THE CORRECT CODE
           }
           else//IF THE USER ENTERS ANYTHING OTHER THAN Y THEN DISCOUNT IS 0
           {
               discount=0;
           }
           System.out.println("ENTER YOUR NAME");
           nm=sc.nextLine();
           nm=sc.nextLine();
           System.out.println("\f");
           System.out.println("WE HAVE FOUND THE BEST FLIGHTS BASED ON YOUR INPUT");//SHOWING THE OPTIONS TO THE USER
           System.out.println("  Flight timing  Flight name  Duration    Fare");
           System.out.println("1. 02:10-04:20    6E 6371     2h10m    INR 7371\n");
           System.out.println("2. 07:30-08:20    6E 7820      50m     INR 10371\n");
           System.out.println("3. 10:10-13:20    6E 9810     3h10m    INR 5210\n");
           System.out.println("4. 14:30-16:20    6E 4517     1h50m    INR 8912\n");
           System.out.println("5. 23:00-00:20    6E 9513     2h20m    INR 7201\n");
           System.out.println("6. 20:10-22:30    6E 6598     2h20m    INR 7391\n");
           System.out.println("7. 11:10-12:20    6E 3412     1h10m    INR 9784\n");
           System.out.println("8. 04:10-05:40    6E 9845     2h30m    INR 6791\n");
           System.out.println("9. 01:50-03:00    6E 0845     1h10m    INR 9945\n");
           System.out.println("10.05:30-07:10    6E 3476     1h40m    INR 8912\n");
           do
           {
           System.out.println("PLEASE ENTER THE CORRESPONDING NUMBER FOR THE FLIGHT YOU CHOSE");
           flight=sc.nextInt();
           }while(flight<=0||flight>10);
           if(flight==1)//COMPUTING THE FARE
           fare=7371*passengers;
           else if(flight==2)
           fare=10371*passengers;
           else if(flight==3)
           fare=5210*passengers;
           else if(flight==4)
           fare=8912*passengers;
           else if(flight==5)
           fare=7201*passengers;
           else if(flight==6)
           fare=7391*passengers;
           else if(flight==7)
           fare=9784*passengers;
           else if(flight==8)
           fare=6791*passengers;
           else if(flight==9)
           fare=9945*passengers;
           else if(flight==10)
           fare=8912*passengers;
           else
           fare=0;
           fare2=0;
    }
    public void roundtrip()//IF USER ENTERS 2 THEN THIS FUNCTION WILLBE CALLED
    {
           System.out.println("\f");
           Scanner sc=new Scanner(System.in);
           System.out.println("WELCOME TO INDIGO'S ROUND TRIP FLIGHT TICKET BOOKING FACILITY\n");
           System.out.println("ENTER YOUR DEPARTURE");//ACCEPTING VALUES FROM THE USER
           d1=sc.nextLine();
           System.out.println("ENTER YOUR DESTINATION");
           d2=sc.nextLine();
           System.out.println("ENTER NUMBER OF PASSENGERS");
           passengers=sc.nextInt();
           System.out.println("ENTER DEPARTURE DATE");
           dep_date1=sc.nextLine();
           dep_date1=sc.nextLine();
           System.out.println("ENTER RETURN DATE");
           dep_date2=sc.nextLine();
           System.out.println("IF YOU HAVE AVAILED ANY OF OUR FACILITIES LIKE:\n");
           System.out.println("Armed Forces Personnel\n6E student\n6E Senior Citizen\nUnaccompanied Minor\n");
           System.out.println("THEN YOU WILL GET TEN PERCENT DISCOUNT ON ALL OUR FLIGHTS\n");
           System.out.println("ENTER y FOR YES OR ANY OTHER LETTER FOR NO");//ASKING IF THE USER HAS ANY SPECIAL SERVICES
           special=sc.next();
           if(special.equalsIgnoreCase("y"))
           {
               double temp=0;
               do
               {
               System.out.println("TO GET THE DISCOUNT PLEASE ENTER THE CODE WE HAVE GIVEN YOU");
               code=sc.nextInt();//ASKING FOR THE CODE
               while(code>0)//LOGIC FOR THE CODE THAT NEEDS TO BE ENTERED
               {
                   double d=code%10;
                   temp=temp+d;
                   code=code/10;
               }
               if(temp%10==0)
               {
                   System.out.println("SUCCESS.YOUR CODE HAS BEEN SUCCESSFULLY PROCESSED\n");
                   System.out.println("ENTER ANY LETTER TO CONTINUE");
                   String x=sc.next();//to add a delay and let the user see the result
                   discount=10;//IF THE USER ENTERS THE RIGHT CODE THEN THIS IS DISPLAYED
               }
               else
               System.out.println("LOOKS LIKE THE CODE IS NOT RIGHT.PLEASE ENTER THE CODE ONCE AGAIN\n");
               }while(discount!=10);//LOOP TILL THE USER ENTERS THE RIGHT CODE
           }
           else
           {
               discount=0;
           }//IF THE USER ENTERS ANYTHING OTHER THAN Y THEN DISCOUNT IS 0
           System.out.println("ENTER YOUR NAME");
           nm=sc.nextLine();
           nm=sc.nextLine();
           System.out.println("\f");
           System.out.println("WE HAVE FOUND THE BEST FLIGHTS BASED ON YOUR INPUT");//SHOWING OPTIONS TO THE USER
           System.out.println("  Flight timing  Flight name  Duration    Fare");
           System.out.println("1. 02:10-04:20    6E 6380     2h10m    INR 7371\n");
           System.out.println("2. 07:30-08:20    6E 7902      50m     INR 10371\n");
           System.out.println("3. 10:10-13:20    6E 9987     3h10m    INR 5210\n");
           System.out.println("4. 14:30-16:20    6E 5975     1h50m    INR 8912\n");
           System.out.println("5. 23:00-00:20    6E 9865     2h20m    INR 7201\n");
           System.out.println("6. 20:10-22:30    6E 2435     2h20m    INR 7391\n");
           System.out.println("7. 11:10-12:20    6E 5425     1h10m    INR 9784\n");
           System.out.println("8. 04:10-05:40    6E 8975     2h30m    INR 6791\n");
           System.out.println("9. 01:50-03:00    6E 0330     1h10m    INR 9945\n");
           System.out.println("10.05:30-07:10    6E 3418     1h40m    INR 8912\n");
           do
           {
           System.out.println("PLEASE ENTER THE CORRESPONDING NUMBER FOR THE FLIGHT YOU CHOSE");
           flight=sc.nextInt();
           }while(flight<=0||flight>10);
           if(flight==1)//COMPUTING THE FLIGHT FARE
           fare=7371*passengers;
           else if(flight==2)
           fare=10371*passengers;
           else if(flight==3)
           fare=5210*passengers;
           else if(flight==4)
           fare=8912*passengers;
           else if(flight==5)
           fare=7201*passengers;
           else if(flight==6)
           fare=7391*passengers;
           else if(flight==7)
           fare=9784*passengers;
           else if(flight==8)
           fare=6791*passengers;
           else if(flight==9)
           fare=9945*passengers;
           else if(flight==10)
           fare=8912*passengers;
           else
           fare=0;
           System.out.println("NOW PLEASE CHOOSE YOUR RETURN TICKET FOR YOUR RETURN ON "+dep_date2);
           System.out.println("  Flight timing  Flight name  Duration    Fare\n");//SHOWING DETAILS FOR RETURN FLIGHT
           System.out.println("1. 02:10-04:20    6E 6375     2h10m    INR 7354\n");
           System.out.println("2. 07:30-08:20    6E 7474      50m     INR 10435\n");
           System.out.println("3. 10:10-13:20    6E 9534     3h10m    INR 5234\n");
           System.out.println("4. 14:30-16:20    6E 5347     1h50m    INR 8955\n");
           System.out.println("5. 23:00-00:20    6E 9596     2h20m    INR 7265\n");
           System.out.println("6. 20:10-22:30    6E 2535     2h20m    INR 7365\n");
           System.out.println("7. 11:10-12:20    6E 5877     1h10m    INR 9765\n");
           System.out.println("8. 04:10-05:40    6E 8546     2h30m    INR 6844\n");
           System.out.println("9. 01:50-03:00    6E 0455     1h10m    INR 9946\n");
           System.out.println("10.05:30-07:10    6E 3768     1h40m    INR 8946\n");
           do
           {
           System.out.println("PLEASE ENTER THE CORRESPONDING NUMBER FOR THE FLIGHT YOU CHOSE");
           flight2=sc.nextInt();
           }while(flight2<=0||flight2>10);
           if(flight2==1)//COMPUTING FOR THE RETURN FLIGHT FARE
           fare2=7354*passengers;
           else if(flight2==2)
           fare2=10435*passengers;
           else if(flight2==3)
           fare2=5234*passengers;
           else if(flight2==4)
           fare2=8955*passengers;
           else if(flight2==5)
           fare2=7265*passengers;
           else if(flight2==6)
           fare2=7365*passengers;
           else if(flight2==7)
           fare2=9765*passengers;
           else if(flight2==8)
           fare2=6844*passengers;
           else if(flight2==9)
           fare2=9946*passengers;
           else if(flight2==10)
           fare2=8946*passengers;
           else
           fare2=0;
    }
    void snacks()//ASKING THE USER FOR SNACKS
        {
            String order;
            String order2;
            System.out.println("\f");
            Scanner sc=new Scanner(System.in);
        System.out.println("*********** WELCOME TO THE SNACK BAR OF INDIGO AIRLINES ************");
        System.out.println("YOU CAN PREORDER MEALS NOW OR YOU CAN BUY THEM DURING YOUR FLIGHT ALSO");
        System.out.println("1. COCA COLA    2. SPRITE");//OPTIONS
        System.out.println("3. FRUIT        4. SEVEN UP");
        System.out.println("5. TEA          6.COFFEE\nALL ARE AVAILABLE AT INR 45 EACH.");   
        System.out.print("DO YOU WANT YO BUY ANYTHING HERE\n PLEASE ENTER Y FOR YES OR N FOR NO\n");
        order=sc.next();
        int order_number;
        int tot_order;
        if(order.equalsIgnoreCase("Y"))
        {
        System.out.print("CHOOSE YOUR BEVERAGE BY ENTERING THE NUMBER :");
        order_number=sc.nextInt();
        System.out.print("ENTER THE TOTAL NUMBER OF BEVERAGE YOU WANT TO BUY :");
        tot_order=sc.nextInt();//COMPUTING THE TOTAL
        tot_cost=tot_order*45;
        }
        else
        tot_cost=0;
        System.out.println("1. VEG SAMOSA                2. VEG PUFF");
        System.out.println("3. VEG SANDWICH              4. VEG PIZZA");
        System.out.println("5. FRENCH FRIES              6. VEG BURGER");//OPTIONS
        System.out.println("7. CHICKEN BURGER              8. CHICKEN PUFF ROLL");
        System.out.println("ALL SNACKS ARE AVAILABLE AT A PRICE OF INR 90");
        System.out.print("DO YOU WANT YO BUY ANYTHING HERE\nPLEASE ENTER Y FOR YES OR N FOR NO ");
        order2=sc.next();
        if(order2.equalsIgnoreCase("Y"))
        {
        System.out.println("CHOOSE YOUR SNACK BY ENTERING THE NUMBER");
        int order_number2=sc.nextInt();
        System.out.println("ENTER THE TOTAL NUMBER OF SNACKS YOU WANT TO BUY");
        int tot_order2=sc.nextInt();
        tot_cost2=tot_order2*90;//COMPUTING FOR SNACKS
        }
        else
        tot_cost2=0;
    }
    public void cancel()//METHOD TO ASK THE USER FOR CANCELLING THE TICKETS IF NEEDED
    {
        System.out.println("\f");
        Scanner sc=new Scanner(System.in);
        String cancelling="";
        do
        {
        System.out.println("IF YOU WANT TO QUIT BUYING YOUR TICKETS ENTER Q ELSE ENTER C TO CONTINUE");
        cancelling=sc.next();
        if(cancelling.equalsIgnoreCase("Q"))
        {
        System.out.println("THANK YOU FOR TRYING INDIGO AIRLINES \n");
        System.exit(1);//EXITING THE CODE IF THE USER ENTERS Q
        }
        else if(cancelling.equalsIgnoreCase("C"))
        break;//CONTINUING THE CODE AND NOT EXITING
        else
        System.out.println("PLEASE ENTER A RELEVANT ANSWER");//IF THE USER ENTERS SOMETHING ELSE
        }while(cancelling!="Q"&&cancelling!="q"&&cancelling!="C"&&cancelling!="c");
    }
    public void display()
    {
        System.out.println("\f");
        Scanner sc=new Scanner(System.in);
        System.out.println("\t\t\t**** TOTAL FARE PRICE ****\n");
        //TO DISPLAY THE DETAILS
        System.out.println("NAME "+nm);
        System.out.println("TOTAL NUMBER OF PASSENGERS:"+passengers);
        System.out.println("DEPARTURE FROM "+d1);//SHOWING ALL THE DETAILS
        System.out.println("DESTINATION TO "+d2);
        System.out.println("DEPARTURE DATE :"+dep_date1);
        System.out.println("RETURN DATE :"+dep_date2);
        if(n1==1)
        {
        System.out.println("TYPE OF FLIGHT:ONE WAY");
        System.out.println("FLIGHT DETAILS");//IF THE USER CHOSE ONE WAY THEN THESE DETAILS WILL BE SHOWN
        if(flight==1)
        System.out.println("1. 02:10-04:20    6E 6371     2h10m    INR 7371");
        
        if(flight==2)
        System.out.println("2. 07:30-08:20    6E 7820      50m     INR 10371");
        if(flight==3)
        System.out.println("3. 10:10-13:20    6E 9810     3h10m    INR 5210");
        if(flight==4)
        System.out.println("4. 14:30-16:20    6E 4517     1h50m    INR 8912");
        if(flight==5)
        System.out.println("5. 23:00-00:20    6E 9513     2h20m    INR 7201");
        if(flight==6)
        System.out.println("6. 20:10-22:30    6E 6598     2h20m    INR 7391");
        if(flight==7)
        System.out.println("7. 11:10-12:20    6E 3412     1h10m    INR 9784");
        if(flight==8)
        System.out.println("8. 04:10-05:40    6E 9845     2h30m    INR 6791");
        if(flight==9)
        System.out.println("9. 01:50-03:00    6E 0845     1h10m    INR 9945");
        if(flight==10)
        System.out.println("10.05:30-07:10    6E 3476     1h40m    INR 8912");
        }
        else
        {
        System.out.println("TYPE OF FLIGHT:ROUND TRIP");//IF THE USER CHOSE ROUND TRIP THEN THESE DETAILS WILL BE SHOWN
        System.out.println("FLIGHT DETAILS");
        if(flight==1)
        System.out.println("1. 02:10-04:20    6E 6371     2h10m    INR 7371");
        if(flight==2)
        System.out.println("2. 07:30-08:20    6E 7820      50m     INR 10371");
        if(flight==3)
        System.out.println("3. 10:10-13:20    6E 9810     3h10m    INR 5210");
        if(flight==4)
        System.out.println("4. 14:30-16:20    6E 4517     1h50m    INR 8912");
        if(flight==5)
        System.out.println("5. 23:00-00:20    6E 9513     2h20m    INR 7201");
        if(flight==6)
        System.out.println("6. 20:10-22:30    6E 6598     2h20m    INR 7391");
        if(flight==7)
        System.out.println("7. 11:10-12:20    6E 3412     1h10m    INR 9784");
        if(flight==8)
        System.out.println("8. 04:10-05:40    6E 9845     2h30m    INR 6791\n");
        if(flight==9)
        System.out.println("9. 01:50-03:00    6E 0845     1h10m    INR 9945\n");
        if(flight==10)
        System.out.println("10.05:30-07:10    6E 3476     1h40m    INR 8912\n");
        System.out.println("RETURN FLIGHT DETAILS\n");//THE DETAILS OF THE RETURN FLIGHT
        if(flight2==1)
        System.out.println("1. 02:10-04:20    6E 6375     2h10m    INR 7354\n");
        if(flight2==2)
        System.out.println("2. 07:30-08:20    6E 7474      50m     INR 10435\n");
        if(flight2==3)
        System.out.println("3. 10:10-13:20    6E 9534     3h10m    INR 5234\n");
        if(flight2==4)
        System.out.println("4. 14:30-16:20    6E 5347     1h50m    INR 8955\n");
        if(flight2==5)
        System.out.println("5. 23:00-00:20    6E 9596     2h20m    INR 7265\n");
        if(flight2==6)
        System.out.println("6. 20:10-22:30    6E 2535     2h20m    INR 7365\n");
        if(flight2==7)
        System.out.println("7. 11:10-12:20    6E 5877     1h10m    INR 9765\n");
        if(flight2==8)
        System.out.println("8. 04:10-05:40    6E 8546     2h30m    INR 6844\n");
        if(flight2==9)
        System.out.println("9. 01:50-03:00    6E 0455     1h10m    INR 9946");
        if(flight2==10)
        System.out.println("10.05:30-07:10    6E 3768     1h40m    INR 8946");
        }
        System.out.println("TOTAL FARE IS INR "+(fare+fare2));//TOTAL FARE IS COMPUTED
        System.out.println("YOUR TOTAL FARE FOR FOOD PRODUCTS IS INR "+(tot_cost+tot_cost2));
        double totalfare=0;//TOTAL FARE INCLUDING FOOD PRODUCTS IS COMPUTED
        if(discount==10)//IF DISCOUNT IS THEIR THEN THE DISCOUNT WILL BE COMPUTED
        {
            totalfare=(fare+fare2+tot_cost+tot_cost2)-((fare+fare2+tot_cost+tot_cost2)*10/100);
        }
        else
        totalfare=fare+fare2+tot_cost+tot_cost2;
        System.out.println("YOUR TOTAL FARE WITH THE DISCOUNT(IF ANY) IS INR "+(totalfare));
        System.out.println("THANK YOU FOR CHOOSING INDIGO AIRLINES");//TOTAL FARE ALONG WITH OTHER DETAILS IS SHOWN
        System.out.println("YOU CAN ALSO VISIT OUR HOMEPAGE TO GET MORE OFFERS");
    }//END OF ALL METHODS
}//END OF CLASS
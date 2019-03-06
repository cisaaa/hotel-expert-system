
package testexpertsystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;


public class TestExpertSystem {


    public static void main(String[] args) throws IOException{
       
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String user;
        
//        String[] info;
        String a = "",b = "",c = "",d = "",e = "",f = "",g = "",h="";
       
        //[meeting/conference/convention/function halls,laundry,restaurant/bar,massage,airport, breakfast,coffee shop, fitness center]
        String[] fbhotel = {"y","y","y","y","y","y","y","y"};
        String[] thefarm = {"y","y","y","y","y","y","y","n"};
        String[] paraiso = {"y","y","y","y","y","y","n","n"};
        String[] lapamela = {"y","n","y","y","n","n","y","y"}; 
        String[] eightyeight = {"y","y","n","n","n","n","n","n"};
        String[] mezza = {"n","n","y","n","n","n","y","n"};
        String[] crownsuites = {"n","y","n","y","n","n","n","n"};
        String[] aquila = {"y","y","n","n","n","n","y","n"};
        String[] ramona = {"y","y","y","n","n","n","y","n"};
        String[] butlers = {"n","n","n","n","n","n","n","n"};

    
        System.out.println("\n-----------------------A PLACE TO STAY---------------------------");
        
        System.out.println("\nInput 'Y' if Yes and 'N' if No ");
   
        System.out.print("\nDo you like to stay in a hotel with meeting/conference/convention/function halls facilities? ");
        a=toLowerCase(br.readLine());

        System.out.print("Do you like to stay in a hotel with laundry facilities? ");
        b=toLowerCase(br.readLine());

        System.out.print("Do you like to stay in a hotel with restaurant/bar? ");
        c=toLowerCase(br.readLine());

        System.out.print("Do you like to stay in a hotel with massage facilities? ");
        d=toLowerCase(br.readLine());

        System.out.print("Do you like to stay in a hotel with airport-transfer service? ");
        e=toLowerCase(br.readLine());

        System.out.print("Do you like to have free breakfast? ");
        f=toLowerCase(br.readLine());

        System.out.print("Do you like to stay in a hotel with coffee shop? ");
        g=toLowerCase(br.readLine());

        System.out.print("Do you like to stay in a hotel with fitness center? ");
        h=toLowerCase(br.readLine());
        
        String[] userinfo={a,b,c,d,e,f,g,h}; 
//        System.out.println(Arrays.toString(userinfo));

           if (Arrays.equals(userinfo,fbhotel))  
                System.out.println("\nFB Hotel");
           else if (Arrays.equals(userinfo,thefarm)) 
                System.out.println("\nThe Farm @ Carpenter Hill"); 
           else if (Arrays.equals(userinfo,paraiso)) 
                System.out.println("\nParaiso Verde Hotel"); 
           else if (Arrays.equals(userinfo,lapamela)) 
                System.out.println("\nLa Pamela Suites"); 
           else if (Arrays.equals(userinfo,eightyeight)) 
                System.out.println("\nEighty Eight Hotel"); 
           else if (Arrays.equals(userinfo,mezza)) 
                System.out.println("\nMezza Hotel"); 
           else if (Arrays.equals(userinfo,crownsuites)) 
                System.out.println("\nCrown Suites"); 
           else if (Arrays.equals(userinfo,aquila)) 
                System.out.println("\nAquila d'Oro Bed and Breakfast"); 
           else if (Arrays.equals(userinfo,ramona)) 
                System.out.println("\nRamona Plaza Hotel"); 
           else if (Arrays.equals(userinfo,butlers)) 
                System.out.println("\nButlers House"); 
           else
                System.out.println("\nI can't help you find a place to stay. Try again");
                user=br.readLine();
        
        

    }
    
}

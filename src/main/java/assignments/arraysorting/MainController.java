package assignments.arraysorting;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @RequestMapping("/")

    public String arraySorting(){
        int[] arr = { 45, 87, 39, 32, 93, 86, 12, 44, 75, 50 };
        String result="";

        int temp=0;

        result+="before: ";

        for ( int i=0; i<arr.length; i++ )
            result+=arr[i] + " ";



        for(int i=0;i<arr.length-1;i++){

            for(int j=i+1;j<arr.length;j++){

                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }

        }



        result+="<br/>"+"after: ";

        for (int i=0; i<arr.length; i++ ) {
            result += arr[i] + " ";
            System.out.println(arr[i]);
        }


    return result;
    }
}

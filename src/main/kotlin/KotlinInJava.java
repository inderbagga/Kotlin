import java.util.Date;

public class KotlinInJava{

    public static void main(String[]args){

        System.out.println(Utils.display());

        Event event=new Event("Turkey");
        Date when=event.date;
    }
}
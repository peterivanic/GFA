import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class TelephoneBook {
    public static void main(String[] args) {
//        Create a map with the following key-value pairs:
        Map<String,String > telephoneBook = new HashMap<>();
        telephoneBook.put("William A. Lathan","405-709-1865");
        telephoneBook.put("John K. Miller","402-247-8568");
        telephoneBook.put("Hortensia E. Foster","606-481-6467");
        telephoneBook.put("Amanda D. Newland","319-243-5613");
        telephoneBook.put("Brooke P. Askew","307-687-2982");

//        What is John K. Miller's phone number?
        System.out.println(telephoneBook.get("John K. Miller"));

//        Whose phone number is 307-687-2982?
      for (Map.Entry<String,String> obj : telephoneBook.entrySet()){
          String number = obj.getValue();
          if (Objects.equals(number, "307-687-2982")){
              System.out.println(obj.getKey());
          }
      }

//        Do we know Chris E. Myers' phone number? (yes/no)
        if (telephoneBook.containsKey("Chris E. Myers")){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }

    }
}

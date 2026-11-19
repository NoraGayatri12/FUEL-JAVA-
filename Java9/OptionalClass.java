// class OptionalClass{
//     public static void main(String[] args) {
//         String z=null;

//         if(z==null)
//             try{
//                  z.length();          //Generate NullException
//             }
//             catch(Exception e){
//                 System.out.println(e);
//             }
//     }
// }

// Using Optional Class

import java.util.Optional;

class OptionalClass{
    public static void main(String[] args) {
        String z="Gayatri";
        if(z==null)
            System.out.println(Optional.ofNullable(z));
        else
            System.out.println(z.length());
    }
}
public class AppendA {
    // - Create an array variable named `animals`
//   with the following content:
//   `["koal", "pand", "zebr", "anacond", "bo", "chinchill", "cobr", "gorill",
//     "hyen", "hydr", "iguan", "impal", "pum", "tarantul", "pirahn"]`
//
// - Add an `"a"` at the end of all elements (use a loop!)
    public static void main(String[] args) {
        String[] animals = {
                "koal", "pand", "zebr", "anacond", "bo", "chinchill", "cobr", "gorill",
                "hyen", "hydr", "iguan", "impal", "pum", "tarantul", "pirahn"
        };
        char a = 'a';
        for (int i = 0; i < animals.length; i++) {
            String animal = animals[i];
            animals[i] = animal + a;
        }
        for (String animal : animals) {
            System.out.println(animal);
        }
    }
}
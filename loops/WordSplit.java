public class WordSplit {
        public static void main(String[] args) {
            String TestInput = "He said that's not a good idea";
            String[] splits = TestInput.trim().split("\\s+");
                    for (String t: splits) {
                        System.out.println(t);    
                    }
                }
            }
    package LoginBean;
    /**
     *
     * @author Rupinder
     */
    public class Question {
        /**
         * @param args the command line arguments
         */
        private String Category;
        private int Value;
        private String Question;
        private String Answer1;
        private String Answer2;
        private String Answer3;
        private String Answer4;
        private String CorrectAnswer;
        
        public Question(){
            
        }
        
        public Question(String Category,int Value, String Question, 
                String Answer1, String Answer2,String Answer3,String Answer4
                ,String CorrectAnswer){
            
            this.Category = Category;
            this.Value=Value;
            this.Question=Question;
            this.Answer1=Answer1;
            this.Answer2=Answer2;
            this.Answer3=Answer3;
            this.Answer4=Answer4;
            this.CorrectAnswer=CorrectAnswer;
            
        }

        
        public String getCategory(){
                return Category;
        }
        public void setCategory(String newCategory){
            Category = newCategory;
        }
        
        public int getValue(){
                return Value;
        }
        public void setValue(int newValue){
            Value = newValue;
        }
        
        public String getQuestion(){
                return Question;
        }
        public void setQuestion(String newQuestion){
            Question = newQuestion;
        }
        
        public String getAnswer1(){
                return Answer1;
        }
        public void setAnswer1(String newAnswer1){
            Answer1 = newAnswer1;
        }
        
        public String getAnswer2(){
                return Answer2;
        }
        public void setAnswer2(String newAnswer2){
            Answer2 = newAnswer2;
        }
        
        public String getAnswer3(){
                return Answer3;
        }
        public void setAnswer3(String newAnswer3){
            Answer3 = newAnswer3;
        }
        
        public String getAnswer4(){
                return Answer4;
        }
        public void setAnswer4(String newAnswer4){
            Answer4 = newAnswer4;
        }
        
        public String getCorrectAnswer(){
                return CorrectAnswer;
        }
        public void setCorrectAnswer(String newCorrectAnswer){
            CorrectAnswer = newCorrectAnswer;
        }

    }

public class OwnString {

    //1.charAt()
    public char charAt(String str ,Integer idx) {
        if(idx < 0 || str.length()==0 || idx >= str.length()) throw new StringIndexOutOfBoundsException();
        return str.toCharArray()[idx];
    }

    //2.codePointAt()
    public Integer codePointAt(String str , Integer idx){
        if(idx < 0 || str.length()==0 || idx >= str.length()) throw new StringIndexOutOfBoundsException();
        return (int)str.toCharArray()[idx];
    }

    //3.codePointBefore
    public Integer codePointBefore(String str , int idx){
        if(--idx < 0 || str.length()==0 || idx >= str.length()) throw new StringIndexOutOfBoundsException();
        return (int)str.toCharArray()[idx];
    }

    //4.codePointCount
    public Integer codePointCount(String str ,  int startIdx , int endIdx){
        if(startIdx < 0 || str.length()==0 || startIdx > str.length()
         || endIdx < 0 || str.length()==0 || endIdx > str.length()) throw new StringIndexOutOfBoundsException();
        if(endIdx >=str.length() ) endIdx = str.length();
        return endIdx-startIdx;
    }

    //5 compareTo
    public  Integer compareTo(String str1 , String str2){
        int res=0;
        if(str1.length() < str2.length()) res =  ~str1.length();
        if(str2.length() < str1.length()) res =  str2.length()+1;
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)!=str2.charAt(i)) res = (int)str1.charAt(i) - (int)str2.charAt(i);
        }
        return  res;
    }

    //6 compareToIgnoreCase
    public Integer compareToIgnoreCase(String str1 , String str2){
        int res=0;
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        if(str1.length() < str2.length()) res =  ~str1.length();
        if(str2.length() < str1.length()) res =  str2.length()+1;
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)!=str2.charAt(i)) res = (int)str1.charAt(i) - (int)str2.charAt(i);
        }
        return  res;
    }

    //7 concat
    public String concat(String str1 ,String str2){
        return str1+str2;
    }

    //8 contains
    public Boolean contains(String str1 ,String str2){
        Boolean flag = false;
        for(int i=0;i<str1.length();i++) {
            if(str1.charAt(i) == str2.charAt(0) ){
                if(i ==str1.length()-1 && str2.length() > 1) break;
                for(int j=0;j<str2.length();j++){
                  if(str1.charAt(i+j)!= str2.charAt(j)) break;
                  if(j == str2.length()-1 && str1.charAt(i+j)==str2.charAt(j) ) flag = true;
                }
                if(flag ==true) break;
            }
        }
        return flag;
    }

    //9 equals
    public  Boolean equals(String str1 , String str2){
        Boolean res = true;
        int len = str1.length() < str2.length() ? str1.length() : str2.length();
        for(int i=0;i<len;i++){
            if(str1.charAt(i)!=str2.charAt(i)) {
                res = false ;
                break;
            }
        }
        if(str1.length() != str2.length()) res =  false;
        return res;
    }

    //10
    public String copyValueOf(char[] arr , int startIdx , int endIdx){
        String res  ="";
        if(startIdx < 0 || endIdx > arr.length) throw  new ArrayIndexOutOfBoundsException();
        for(int i=startIdx;i<endIdx;i++){
            res+=arr[i];
        }
        return res;
    }

    //11
    public Boolean equalsIgnoreCase(String str1 ,String str2){
        Boolean res = true;
        int len = str1.length() < str2.length() ? str1.length() : str2.length();
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        for(int i=0;i<len;i++){
            if(str1.charAt(i)!=str2.charAt(i)) {
                res = false ;
                break;
            }
        }
        if(str1.length() != str2.length()) res =  false;
        return res;
    }

    //12
    public Boolean startsWith(String str1 ,String str2 ){
        Boolean res = true;
        if(str1.length() < str2.length()) res  = false;
        if(res){
            for(int i=0;i<str2.length();i++){
                if(str2.charAt(i)!=str1.charAt(i)){
                    res = false ;
                    break;
                }
            }
        }
        return res;
    }

    //13
    public Boolean endsWith(String str1 , String str2){
        Boolean res = true;
        int temp = str1.length()-str2.length();
        if(str1.length() < str2.length()) res  = false;
        if(res){
            for(int i=0;i<str2.length();i++){
                if(str2.charAt(i)!=str1.charAt(temp+i)){
                    res = false ;
                    break;
                }
            }
        }
        return res;
    }

    //14
    public byte[] getBytes(String str){
        if(str.isEmpty()) throw  new UnsupportedOperationException();
        char[] strArr = str.toCharArray();
        byte[] arr = new byte[strArr.length];
        for(int i=0;i<strArr.length;i++){
            arr[i] = (byte) strArr[i];
        }
        return  arr;
    }

    //15
    public  void getChars(String str , Integer srcbBeginIdx , Integer srcEndIdx , char[] arr , Integer destBeginIdx){
        if(srcbBeginIdx < 0 || srcbBeginIdx > srcEndIdx || srcEndIdx > str.length() ||
         srcEndIdx < 0 || srcEndIdx-srcbBeginIdx > arr.length) throw  new StringIndexOutOfBoundsException();
        int temp = destBeginIdx;
        char[] tempArr = str.toCharArray();
        for(int i=srcbBeginIdx;i<srcEndIdx;i++){
            arr[temp++] = tempArr[i];
        }
    }

    //16

    public int hasCode(String str){
        int res=0 ,temp=1 , len;
        char[] arr = str.toCharArray();
        len = arr.length;
        for(int i=0;i<arr.length;i++){
            int x = (int) arr[i];
            int y = len-temp;
            res+=x*Math.pow(31,y);
            temp++;
        }
        return res;
    }

    //17

    public int indexOf(String str1 , String str2){
        Boolean flag = false;
        Integer idx = -1;
        for(int i=0;i<str1.length();i++) {
            if(str1.charAt(i) == str2.charAt(0) ){
                if(i ==str1.length()-1 && str2.length() > 1) break;
                for(int j=0;j<str2.length();j++){
                    if(str1.charAt(i+j)!= str2.charAt(j)) break;
                    if(j == str2.length()-1 && str1.charAt(i+j)==str2.charAt(j) ){
                        flag  =true;
                        idx = i;
                    };
                }
                if(flag ==true) break;
            }
        }
        return idx;
    }

    //18

    public int lastIndexOf(String str1 , String str2){
        int res  =-1;
        Boolean flag = false;
        Integer idx = -1;
        for(int i=0;i<str1.length();i++) {
            if(str1.charAt(i) == str2.charAt(0) ){
                if(i ==str1.length()-1 && str2.length() > 1) break;
                for(int j=0;j<str2.length();j++){
                    if(str1.charAt(i+j)!= str2.charAt(j)) break;
                    if(j == str2.length()-1 && str1.charAt(i+j)==str2.charAt(j) ){
                        flag  =true;
                        idx = i;
                    };
                }
            }
        }
        return idx;
    }

    //19

    public  int length(String str){
        char[] arr = str.toCharArray();
        int i=0;
        for(;i<arr.length;i++);
        return i;
    }

    //20

    public String replace(String str1 , String str2 , String replaceString)
    {
        String res = "";
        Boolean flag = false;
        for(int i=0;i<str1.length();i++) {
            if(str1.charAt(i) == str2.charAt(0) ){
                if(i ==str1.length()-1 && str2.length() > 1) {
                    res+=str1.charAt(i);
                    break;
                }
                for(int j=0;j<str2.length();j++){
                    if(str1.charAt(i+j)!= str2.charAt(j)) break;
                    if(j == str2.length()-1 && str1.charAt(i+j)==str2.charAt(j) ) flag = true;
                }
                if(flag ==true){
                    res+=replaceString;
                    i+=str2.length()-1;
                    continue;
                }
            }
            res+=str1.charAt(i);
        }
        return res;
    }

    //21

    public String replaceAll(String str1 , String str2 , String replaceString){
        String res = "";
        Boolean flag = false , changed = false;
        for(int i=0;i<str1.length();i++) {
            if(str1.charAt(i) == str2.charAt(0) ){
                if(i ==str1.length()-1 && str2.length() > 1) {
                    res+=str1.charAt(i);
                    break;
                }
                for(int j=0;j<str2.length();j++){
                    if(str1.charAt(i+j)!= str2.charAt(j)) break;
                    if(j == str2.length()-1 && str1.charAt(i+j)==str2.charAt(j) ) flag = true;
                }
                if(flag ==true && !changed){
                    res+=replaceString;
                    i+=str2.length()-1;
                    changed = true;
                    continue;
                }
            }
            res+=str1.charAt(i);
        }
        return res;
    }

    //22

    public  String[] split(String str1 , String str2){
        String temp = "" , res="";
        int size=0;
        for(int i=0;i<str1.length();i++){
            int count = 0;
            if(str1.charAt(i)==str2.charAt(0)){
                for(int j=0;j<str2.length();j++){
                    if(str1.charAt(i+j) !=str2.charAt(j)) break;
                    count++;
                }
            }
            if(count ==str2.length()){
                res+=temp+"*";
                size++;
                temp = "";
                i+=str2.length()-1;
                continue;
            }
            temp+=str1.charAt(i);
            if(i==str1.length()-1){
                res+=temp+"*";
                size++;
            }
        }
        String[] arr = new String[size];
        int x = 0;
        temp = "";
        for(int i=0;i<res.length();i++){
            if(res.charAt(i)=='*'){
                arr[x++] = temp;
                temp = "";
                continue;
            }
            temp+=res.charAt(i);
        }
        return arr;
    }

    //23

    public  String subString(String str , int startIdx , int endIdx){
        String res = "";
        if(startIdx < 0 || endIdx <0 || startIdx > endIdx || endIdx >str.length()) throw  new StringIndexOutOfBoundsException();
        for(int i=startIdx;i<endIdx;i++){
            res+=str.charAt(i);
        }
        return  res;
    }


    //24

    public  String toLowerCase(String str){
        char[] arr = str.toCharArray();
        String res  ="";
        for (int i=0;i<arr.length;i++){
            int ascii = (int)arr[i];
            if(ascii >=65 && ascii <=90){
                res+=(char)(97+ascii-65);
                continue;
            }
            res+=arr[i];
        }
        return res;
    }

    //25
    public String toUpperCase(String str){
        char[] arr = str.toCharArray();
        String res  ="";
        for (int i=0;i<arr.length;i++){
            int ascii = (int)arr[i];
            if(ascii >=97 && ascii <=122){
                res+=(char)(65+ascii-97);
                continue;
            }
            res+=arr[i];
        }
        return res;
    }

    //26

    public  String trim(String str){
        String res="";
        String[] arr = str.split("");
        for(int i=0;i<arr.length;i++){
            if(!arr[i].equals(" ")){
                res+=arr[i];
            }
        }
        return res;
    }

    //27

    public Boolean isEmpty(String str){
        return this.length(str)>0?false:true;
    }

    //28

    public Boolean contentEquals(String str1 , String str2){
        Boolean res = true;
        if(this.length(str1) !=this.length(str2)) res = false;
        if(res){
            for(int i=0;i<str1.length();i++){
                if(str1.charAt(i) !=str2.charAt(i)){res = false;break;};
            }
        }
        return res;
    }

    //29

    public int offsetByCodePoints(String str , int start ,int length){
        if(start < 0 || this.length(str)-start-1 < length || start > length) throw  new StringIndexOutOfBoundsException();
        return start+length;
    }

    //30

    public String toString(Object val){
        String type = val.getClass().getName();
        String res = "";
        if(type.equals("java.lang.Integer") ||  type.equals("java.lang.Double")
                ||type.equals("java.lang.Character") || type.equals("java.lang.Boolean") ||
                type.equals("java.lang.String")){
            res=  val+"";
        }
        else res = type+"@"+val.hashCode();
        return res;
    }

    //31

    public  String format(String exp , Object val){
        String res="";
            for(int i=0;i<exp.length();i++){
                if(exp.charAt(i)=='%' && exp.charAt(i+1)!='.'){
                    char op = exp.charAt(i+1);
                    if (op =='d') {
                        if(val.getClass().getName().equals("java.lang.Double")) {
                            String str = val+"";
                            String[] arr = str.split("[.]");
                            res+=arr[0];
                        }
                        else res+=(int)val;
                    }
                    if (op =='c') res+=(char)val;
                    if (op =='s') res+=(String)val;
                    i++;
                    continue;
                }
                else if(exp.charAt(i)=='.'){
                    int digit = Integer.parseInt(exp.charAt(i+1)+"");
                    res+=this.floatConversion((double)val,digit);
                    i+=2;
                    continue;
                }
               if(i< exp.length()-1 && exp.charAt(i+1)!='.') res+=exp.charAt(i);
            }
        return res;
    }


    public String floatConversion(double val ,int prec ){
        float mul = (float) Math.pow(10,prec+1);
        float mul2 = (float) Math.pow(10,prec);
        val=val/10;
        float ans =Math.round(val*mul)/mul2;
        return "";
    }

    //33

    public  Boolean matches(String regx , String str) {
        Boolean res = true;
        for(int i=0;i<str.length();i++){
            if(regx.startsWith("[a-z]") || regx.startsWith("\\w")){
                if(str.charAt(i) <97 || str.charAt(i)>122){
                    res = false;
                    break;
                }
                if(regx.startsWith("[a-z]")) regx = regx.substring(5);
                else  regx = regx.substring(2);
                continue;
            }
            if(regx.startsWith("[0-9]") || regx.startsWith("\\d")){
                if(str.charAt(i) <48 || str.charAt(i)>57){
                    res = false;
                    break;
                }
                if(regx.startsWith("[0-9]")) regx = regx.substring(5);
                else  regx = regx.substring(2);
                continue;
            }
            if(regx.startsWith("[a-zA-Z0-9]") || regx.startsWith("\\d")){
                if(str.charAt(i)>=65 && str.charAt(i)<=90 || str.charAt(i)>=97 && str.charAt(i)<=122);
                else {
                    res = false;
                    break;
                }
                regx = regx.substring(8);
                continue;
            }
            if(regx.startsWith("\\s") || regx.startsWith("\\d")){
                if(str.charAt(i)!=' '){
                    res = false;
                    break;
                }
                regx = regx.substring(2);
                continue;
            }
        }
        if(!regx.equals("")) res = false;
        return  res;
    }

    public char[] toCharArray(String str){
        char[] arr = new char[str.length()];
        for(int i=0;i<str.length();i++){
            arr[i] = str.charAt(i);
        }
        return arr;
    }


}

public class Main {
    static void main(String[] args) {
        String s1 = "aws s3 --recursive mv s3://petsmile.sta/prof_thumb/000/";
        String s2 = "s3://petsmile.sta/prof_thumb/000/000/";
        String[] cmd = new String[194];
        for (Integer i = 1; i <= 194; i++) {
            if (i < 10) {
                String temp = "00" + i.toString();
                s1 = s1 + temp + "/";
                s2 = s2 + temp + "/";
            } else if (i < 100) {
                String temp = "0" + i.toString();
                s1 = s1 + temp + "/";
                s2 = s2 + temp + "/";
            } else {
                String temp = i.toString();
                s1 = s1 + temp + "/";
                s2 = s2 + temp + "/";
            }
            cmd[i - 1] = s1 + " " + s2;
        }
        for (String s : cmd) {
            System.out.println(s);
        }
    }
}

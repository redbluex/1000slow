package pl.redblue.rob.a100slow;

public class PassExam {
    private int numberPass;
    private String stringPass;

    PassExam(){
        numberPass = 1;
    }

    public String getStringPass() {
        return stringPass;
    }

    public void setStringPass(String stringPass) {
        this.stringPass = stringPass;
    }

    public int getNumberPass() {
        return numberPass;
    }

    public void setNumberPass(int numberPass) {
        this.numberPass = numberPass;
    }

    public void examPassed(){
        numberPass++;
        stringPass = "Brawo zdałeś!";
    }

    public void examFail(){
        stringPass = "Niestety oblałeś!";
    }



}

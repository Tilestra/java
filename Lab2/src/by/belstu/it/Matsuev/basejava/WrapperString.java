package by.belstu.it.Matsuev.basejava;

import java.util.Objects;
/** Wrapper class for strings
 *  @author Asus*/
public class WrapperString {
    private String someStr;

    public WrapperString(String someStr) {
        this.someStr = someStr;
    }
    /** Setter to initialize field {@link WrapperString#someStr}
     *  @see WrapperString*/
    public void setSomeStr(String someStr) {
        this.someStr = someStr;
    }

    public String getSomeStr() {
        return someStr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        WrapperString that = (WrapperString) o;
        return Objects.equals(someStr, that.someStr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(someStr);
    }

    @Override
    public String toString() {
        return "WrapperString{ someStr=" + someStr + "}";
    }

    public void Replace(char oldchar, char newchar){
        System.out.println("hello world");
    }
}

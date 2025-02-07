public class SortingContext {

    SortingStrategy ss ;
    int[] arr;


    public SortingStrategy getSs() {
        return ss;
    }

    public void setSs(SortingStrategy ss) {
        this.ss = ss;
    }


    public void perform(){
        ss.sort(arr);
    }

}

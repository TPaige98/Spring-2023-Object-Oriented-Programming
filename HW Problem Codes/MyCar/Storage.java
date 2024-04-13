public class Storage <a, b, c>
{
    private a first;
    private b second;
    private c third;

    public Storage(a firstObj, b secondObj, c thirdObj)
    {
        first = firstObj;
        second = secondObj;
        third = thirdObj;
    }

    public a getFirst() {return first;}
    public b getSecond() {return second;}
    public c getThird() {return third;}
}

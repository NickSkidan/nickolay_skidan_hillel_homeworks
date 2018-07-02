public class NamesMethod<N> implements Names<N> {
    N[] names;

    NamesMethod(N[] o) {
        names = o;
    }

    @Override
    public boolean isIncluded(N o) {
        for (N name : names) if (name.equals(o)) return true;
        return false;
    }
}

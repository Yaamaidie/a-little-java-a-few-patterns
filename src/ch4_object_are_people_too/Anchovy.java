package ch4_object_are_people_too;

/**
 * Created by lee on 2017/7/10.
 */
class Anchovy extends Fish{
    @Override
    public boolean equals(Object obj) {
        return (obj instanceof Anchovy);
    }
}

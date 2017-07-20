package ch6_object_are_people_too;

/**
 * Created by lee on 2017/7/3.
 */
class Zero extends Num {
    @Override
    public boolean equals(Object obj) {
        return (obj instanceof Zero);
    }
}

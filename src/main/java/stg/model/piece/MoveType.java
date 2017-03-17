package stg.model.piece;

/**
 * Created by rickjackson on 3/13/17.
 */
public enum MoveType {
    NONE(0) {},
    SIMPLE(1) {},
    JUMP(2) {};
    
    private int value;
    
    private MoveType(int value) {
        this.value = value;
    }
}

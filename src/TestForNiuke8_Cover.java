public class TestForNiuke8_Cover {
    public int RectCover(int target) {
        if(target>2){
            return RectCover(target-1)+RectCover(target-2);
        }else if(target==2){
            return 2;
        }else if(target==1){
            return 1;
        }else {
            return 0;

        }

    }
}

package modul_practice_2.task_6;

import static java.lang.Math.*;

public class Vector2D  extends Vector{

    public Vector2D(int x1, int y1, int x2, int y2) {
        super(x1, y1,0, x2, y2, 0);
    }

    @Override//длину вектора
    public double getLength() {
        return Double.parseDouble(String.valueOf(sqrt(pow(x1-x2,2)+pow(y1-y2,2))));
    }

    @Override//координаты вектора через пробел
    public String getVectorCords() {
        return (x2 - x1)+" "+(y2-y1);
    }

    //возвращающий скалярное произведение векторов
    public double getScalarProduct(Vector2D vector2D){
        String cords1=getVectorCords();
        String cords2=vector2D.getVectorCords();
        return Integer.parseInt(cords1.split(" ")[0])*Integer.parseInt(cords2.split(" ")[0])+
                Integer.parseInt(cords2.split(" ")[1])*Integer.parseInt(cords1.split(" ")[1]);
    }

    // косинус угла (в радианах) между векторами, если они не нулевые, иначе метод должен вернуть -2.0.
    public double getAngle(Vector2D vector2D){
        if (getLength() != 0 && vector2D.getLength() !=0){
            return getScalarProduct(vector2D)/(this.getLength()*vector2D.getLength());
        }
        return -2.0;
    }
}

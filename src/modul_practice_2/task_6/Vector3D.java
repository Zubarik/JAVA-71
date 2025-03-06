package modul_practice_2.task_6;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Vector3D extends Vector {

    public Vector3D(int x1, int y1, int z1, int x2, int y2, int z2) {
        super(x1, y1, z1, x2, y2, z2);
    }

    @Override//����� �������
    public double getLength() {
        return Double.parseDouble(String.valueOf(sqrt(pow(x1 - x2, 2) + pow(y1 - y2, 2)) + pow(z1 - z2, 2)));
    }

    @Override//���������� ������� ����� ������
    public String getVectorCords() {
        return (x2 - x1) + " " + (y2 - y1) + " " + (z2 - z1);
    }

    //������������ ��������� ������������ ��������
    public double getScalarProduct(Vector3D vector3D) {
        String cords1 = getVectorCords();
        String cords2 = vector3D.getVectorCords();
        int a = Integer.parseInt(cords1.split(" ")[0]) * Integer.parseInt(cords2.split(" ")[0]);
        int b = Integer.parseInt(cords2.split(" ")[1]) * Integer.parseInt(cords1.split(" ")[1]);
        int c = Integer.parseInt(cords2.split(" ")[2]) * Integer.parseInt(cords1.split(" ")[2]);
        return a + b + c;
    }
}

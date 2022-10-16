import java.util.*;

class RpgGame {

    public RpgGame() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int exp = sc.nextInt();
        int[] po = new int[n];
        int[] bo = new int[n];
        Monster[] monsters = new Monster[n];

        for (int i = 0; i < n; i++) {
            po[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            bo[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            monsters[i] = new Monster(po[i], bo[i]);
        }


        // sorting of array of object using comparator
        
        Arrays.sort(monsters, Comparator.comparingInt(mon -> mon.monster_p));
        
        for (int i = 0; i < n; i++) {
            System.out.println(monsters[i].monster_p + " " + monsters[i].monster_b);
        }

        int count = 0;
        for (int i = 0; i < monsters.length; i++) {
            if (exp >= monsters[i].monster_p) {
                exp += monsters[i].monster_b;
                ++count;
            } else {
                break;
            }
        }
        System.out.println(count);
        
        sc.close();
    }
}

class Monster {
    public final int monster_p;
    public final int monster_b;

    public Monster(int monster_p, int monster_b) {
        this.monster_p = monster_p;
        this.monster_b = monster_b;
    }
}
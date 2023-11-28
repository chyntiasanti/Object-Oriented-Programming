public class Zombie implements Destroyable {
    // Atribut Zombie
    private int health;
    private int level;

     // Konstruktor Zombie
     public Zombie(int health, int level) {
        this.health = health;
        this.level = level;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void heal() {
        
    }
    
    public void destroyed() {
        // Implementasi untuk menandai Zombie sebagai hancur
        // Misalnya, mengatur level menjadi 0
        level = 0;
    }

    // Metode untuk mendapatkan informasi Zombie
    public String getZombieInfo() {
        return  "\n Health: " + health + ", \n Level: " + level;
    }
}


public class WalkingZombie extends Zombie {
    // Konstruktor WalkingZombie
    public WalkingZombie(int health, int level) {
        super(health, level); // Memanggil konstruktor kelas Zombie
    }

    // Implementasi metode heal khusus untuk WalkingZombie
    @Override
    public void heal() {
    }

    // Implementasi metode destroyed khusus untuk WalkingZombie
    @Override
    public void destroyed() {
        // Implementasi untuk menandai bahwa WalkingZombie telah hancur
        // Misalnya, mengatur level menjadi 0
        super.destroyed(); // Memanggil metode destroyed dari kelas Zombie
    }

    // Implementasi metode getZombieInfo khusus untuk WalkingZombie
    @Override
    public String getZombieInfo() {
        // Implementasi untuk mendapatkan informasi WalkingZombie
        // ...
        return "Walking Zombie Data"+super.getZombieInfo(); // Memanggil metode getZombieInfo dari kelas Zombie
    }

}

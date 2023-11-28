public class Plant {
    public void doDestroy(Destroyable destroyable) {
        if (destroyable instanceof WalkingZombie) {
            WalkingZombie walkingZombie = (WalkingZombie) destroyable;
            // Memperbarui kesehatan WalkingZombie
            walkingZombie.setHealth(42);
            // Aksi tambahan jika diperlukan
        } else if (destroyable instanceof JumpingZombie) {
            JumpingZombie jumpingZombie = (JumpingZombie) destroyable;
            // Memperbarui kesehatan JumpingZombie
            jumpingZombie.setHealth(66);
            // Aksi tambahan jika diperlukan
        } else if (destroyable instanceof Barrier) {
            // Kode khusus untuk menghancurkan Barrier
            Barrier barrier = (Barrier) destroyable;

            barrier.setStrength(64);
            // Aksi tambahan jika diperlukan
        } else {
            // Mengatasi kasus lain atau memberikan perilaku default
            System.out.println("Jenis Destroyable tidak didukung");
        }
    }
}

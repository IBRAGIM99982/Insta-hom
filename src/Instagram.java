import java.util.HashSet;
import java.util.Random;
import java.util.Set;
    public class Instagram {
        private Set<String> followers;
        public Instagram() {
            this.followers = new HashSet<>();
            generateRandomFollowers();
        }
        private void generateRandomFollowers() {
            Random random = new Random();
            int numberOfFollowers = random.nextInt(10) + 1;

            for (int i = 1; i <= numberOfFollowers; i++) {
                followers.add("rico" + i);
            }
        }
        public int getFollowerCount() {
            return followers.size();
        }
        public void addFollower(String followerName) {
            if (followers.add(followerName)) {
                System.out.println(followerName + " успешно подписан!");
            } else {
                System.out.println(followerName + " вы уже подписальсь");
            }
        }

        public void showFollowers() {
            System.out.println("Подписки: " + followers);
        }
    }



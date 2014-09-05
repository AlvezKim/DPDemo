package pac.pattern.build;

public class ComplicatedDataHolder {
    private String name;
    private String life;
    private int age;

    public ComplicatedDataHolder(){}

    public static class Builder{
        private String name;
        private String life;
        private int age;

        public Builder() {
        }

        public Builder name(String name){
            this.name = name;
            return this;
        }

        public Builder life(String life){
            this.life = life;
            return this;
        }

        public Builder age(int age){
            this.age = age;
            return this;
        }

        public ComplicatedDataHolder build(){
            ComplicatedDataHolder holder = new ComplicatedDataHolder();
            holder.age = this.age;
            holder.life = this.life;
            holder.name = this.name;
            return holder;
        }

    }

    public String getName() {
        return name;
    }

    public String getLife() {
        return life;
    }

    public int getAge() {
        return age;
    }
}

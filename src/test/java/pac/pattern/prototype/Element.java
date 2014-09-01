package pac.pattern.prototype;


public class Element {
    private String title;
    private String comment;
    private int life;

    private Element() {
    }

    public static class ElementBuilder{
        private Element element = new Element();

        public ElementBuilder setTitle(String title) {
            this.element.title = title;
            return this;
        }

        public ElementBuilder setComment(String comment) {
            this.element.comment = comment;
            return this;
        }

        public ElementBuilder setLife(int life) {
            this.element.life = life;
            return this;
        }

        public Element build(){
            return this.element;
        }
    }

    public String getTitle() {
        return title;
    }

    public String getComment() {
        return comment;
    }

    public int getLife() {
        return life;
    }
}

public abstract class AbstractReaderService <T,V> implements ReaderService <T,V>{

        abstract void printContent();

        static class Reader <T,V>{
66
            public void setGetText(T getText) {
                this.getText = getText;
            }

            public void setGetJson(V getJson) {
                this.getJson = getJson;
            }

            private T getText;
            private V getJson;

            public T getGetText() {
                return getText;
            }

            public V getGetJson() {
                return getJson;
            }

            public Reader(T getText, V getJson) {
                this.getText = getText;
                this.getJson = getJson;
            }

        }

    }

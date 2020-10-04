package main.lessons.lesson14;

public class TestUrl {
;
    public String port;
    public String protocol = "";
    public String domain = "";
    public String path = "";
    public String params = "";

    public static class Builder{
        private TestUrl url;



        public Builder() {
            url = new TestUrl();
        }

        public Builder withProtocol(String protocol){
            url.protocol = protocol;
            return this;
        }
        public Builder withDomain(String domain){
            if(!domain.endsWith(".")){
                url.domain = url.domain + domain + ".";
            } else {
                url.domain = url.domain + domain;

            }
            return this;
        }
        public Builder withPort(String port){
            url.port = ":" + port ;
            return this;
        }
        public Builder withPath(String path){
            url.path = url.path + path;
            return this;
        }
        public Builder withParam(String param){
            url.params = "?" + param;
            return this;
        }
        public Builder withParam(String key, String value){
            url.params ="?" +  key + "=" + value;
            return this;

        }
        public String build(){
            url.domain =  url.domain.endsWith(".") ? url.domain.substring(0, url.domain.length() - 1 ): url.domain;
            return new StringBuilder()
                    .append(url.protocol)
                    .append(url.domain)
                    .append(url.port)
                    .append(url.path)
                    .append(url.params).toString();
        }
    }
}

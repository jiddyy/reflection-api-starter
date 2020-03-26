package org.basecampcodingacademy.reflections.domain;

import java.util.List;

public class Response {
    public Response(int id, int reflectionId, String userUsername, Object o) {
    }

    public class Response {
        public Integer id;
        public Integer reflectionId;
        public String userUsername;
        public List<Object> answers;

        public Response(Integer id, Integer reflectionId, String userUsername, List<Object> answers) {
            this.id = id;
            this.reflectionId = reflectionId;
            this.userUsername = userUsername;
            this.answers = answers;
        }
}}

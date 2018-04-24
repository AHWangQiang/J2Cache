/**
 * Copyright (c) 2015-2017, Winter Lau (javayou@gmail.com).
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.oschina.j2cache.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

/**
 * 使用 fastjson 实现序列化
 *
 * @author Winter Lau(javayou@gmail.com)
 */
public class JSONSerializer implements Serializer {

    @Override
    public String name() {
        return "json";
    }

    @Override
    public byte[] serialize(Object obj) {
        String jsonStr = JSON.toJSONString(obj);
        System.out.println(jsonStr);
        JSONObject json = (JSONObject)JSON.parse(jsonStr);
        System.out.println(json);
        return new byte[0];
    }

    @Override
    public Object deserialize(byte[] bytes) {
        return null;
    }

    public static void main(String[] args) {
        int i = 10;
        new JSONSerializer().serialize(i);
    }
}
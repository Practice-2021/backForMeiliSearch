package edu.citik.configuration;

import com.meilisearch.sdk.Client;
import com.meilisearch.sdk.Config;
import com.meilisearch.sdk.Index;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MeilisearchConfig {

    @Value("${meilisearch.url}")
    private String url;

    @Value("${meilisearch.index}")
    private String indexName;

    @Bean
    Client getClient() throws Exception {
        Client client = new Client(new Config(url, "masterKey"));
        Index index = client.index(indexName);
        return client;
    }

}

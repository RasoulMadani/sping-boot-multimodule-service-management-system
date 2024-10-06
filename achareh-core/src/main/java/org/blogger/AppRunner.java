package org.blogger;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Slf4j
@Component
public class AppRunner implements CommandLineRunner {
    private final BloggerRepository bloggerRepository;
    @Override
    public void run(String... args) throws Exception {
        Blogger blogger1 = Blogger.builder()
                .post("first post ")

                .build();
        bloggerRepository.save(blogger1);
        log.info("first post save : {}",blogger1);
        Blogger blogger2 = Blogger.builder()
                .post("second post ")

                .build();
        bloggerRepository.save(blogger2);
        log.info("second post save : {}",blogger2);
    }
}

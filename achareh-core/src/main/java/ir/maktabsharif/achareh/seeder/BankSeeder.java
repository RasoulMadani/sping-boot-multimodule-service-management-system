package ir.maktabsharif.achareh.seeder;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.bank.maktabsharif.entity.Bank;
import org.bank.maktabsharif.repository.BankRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Slf4j
@Component
public class BankSeeder implements CommandLineRunner{


        private final BankRepository bankRepository;
        @Override
        public void run(String... args) throws Exception {
            Bank bank = Bank.builder().name("allah").build();
            bankRepository.save(bank);
            log.info("second post save : {}",bank);
        }

}

package com.example.demo.bootstrap;

import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
    }

    @Override
    public void run(String... args) throws Exception {

       /*
        OutsourcedPart o= new OutsourcedPart();
        o.setCompanyName("Western Governors University");
        o.setName("out test");
        o.setInv(5);
        o.setPrice(20.0);
        o.setId(100L);
        outsourcedPartRepository.save(o);
        OutsourcedPart thePart=null;
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            if(part.getName().equals("out test"))thePart=part;
        }

        System.out.println(thePart.getCompanyName());
        */
        OutsourcedPart computronTower = new OutsourcedPart();
        computronTower.setCompanyName("Computron");
        computronTower.setName("Computer Tower");
        computronTower.setInv(5);
        computronTower.setPrice(50.0);
        computronTower.setId(100L);

        OutsourcedPart computronHeatSink = new OutsourcedPart();
        computronHeatSink.setCompanyName("Computron");
        computronHeatSink.setName("Heat Sink");
        computronHeatSink.setInv(3);
        computronHeatSink.setPrice(20.0);
        computronHeatSink.setId(101L);

        OutsourcedPart computronMotherboard = new OutsourcedPart();
        computronMotherboard.setCompanyName("Computron");
        computronMotherboard.setName("Motherboard");
        computronMotherboard.setInv(2);
        computronMotherboard.setPrice(75.0);
        computronMotherboard.setId(102L);

        OutsourcedPart hudsonRam = new OutsourcedPart();
        hudsonRam.setCompanyName("Hudson");
        hudsonRam.setName("RAM");
        hudsonRam.setInv(15);
        hudsonRam.setPrice(70.0);
        hudsonRam.setId(103L);

        OutsourcedPart hudsonCpu = new OutsourcedPart();
        hudsonCpu.setCompanyName("Hudson");
        hudsonCpu.setName("CPU");
        hudsonCpu.setInv(3);
        hudsonCpu.setPrice(100.0);
        hudsonCpu.setId(104L);

        long partCount = outsourcedPartRepository.count();
            outsourcedPartRepository.save(computronTower);
            outsourcedPartRepository.save(computronHeatSink);
            outsourcedPartRepository.save(computronMotherboard);
            outsourcedPartRepository.save(hudsonRam);
            outsourcedPartRepository.save(hudsonCpu);
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            System.out.println(part.getName()+" "+part.getCompanyName());
        }

        /*
        Product bicycle= new Product("bicycle",100.0,15);
        Product unicycle= new Product("unicycle",100.0,15);
        productRepository.save(bicycle);
        productRepository.save(unicycle);
        */
        Product refurbishedLaptop = new Product("Refurbished Laptop", 100,15);
        Product newLaptop = new Product("New Laptop", 150.0, 8);
        Product refurbishedWorkstation = new Product("Refurbished Workstation", 125.0,5);
        Product newDesktop = new Product("New Desktop", 175,3);
        Product refurbishedGamingLaptop = new Product("Refurbished Gaming Laptop", 200.0, 2);
        long productCount = productRepository.count();
            productRepository.save(refurbishedLaptop);
            productRepository.save(newLaptop);
            productRepository.save(refurbishedWorkstation);
            productRepository.save(newDesktop);
            productRepository.save(refurbishedGamingLaptop);

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());

    }
}

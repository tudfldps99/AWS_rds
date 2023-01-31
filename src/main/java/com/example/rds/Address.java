// 2023-01-31
package com.example.rds;

import lombok.*;

import javax.persistence.*;

@Entity
@Setter @Getter @ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
public class Address {

    @Id
    @Column(name = "addr_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String city;
    private String province;
    private String postCode;
}

package com.example.thongdt.englishtest.objects;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by thongdt on 30/10/2015.
 */

@Data
@NoArgsConstructor
public class Menu {
    private String title;
    private String menu;
    private int idImage;
    private int type;
}

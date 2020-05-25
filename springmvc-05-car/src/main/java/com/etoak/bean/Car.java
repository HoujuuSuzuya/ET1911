package com.etoak.bean;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class Car {
	private Integer id;
	
	@NotNull(message = "brand不准null")
	@NotEmpty(message = "brand不准null")
	private String brand;
	
	@NotNull(message = "series不准null")
	@NotEmpty(message = "series不准null")
	private String series;
	
	@NotNull(message = "price不准null")
	@Min(value = 1,message = "price最小1")
	@Max(value = 100,message = "超过100就卖不出了")
	private Integer price;
	private String licensingTime;
	private String level;
	private String gearbox;
	private String outputVolume;
	private Integer mileage;
	private String location;
	private String pic;
	
	@Size(min=6,max=18,message = "概述长度6-18")
	private String summary;
	private String createTime;
}

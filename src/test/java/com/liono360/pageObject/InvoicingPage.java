package com.liono360.pageObject;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.liono360.loginPage.Baseclass;


public class InvoicingPage extends Baseclass{
	WebDriver ldriver;

	public InvoicingPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	

	 @FindBy(xpath="//*[text()='Sales']")
	    WebElement btnSales;
	  
	  public WebElement clickSales() {
		  return btnSales;
	  }
	  
	  @FindBy(xpath="//span[contains(text(),'Inventory')]")
		WebElement btnInventory;

	public WebElement clickInventory() {
		
		return btnInventory;
	}
	  @FindBy(xpath="//p-dropdown[@optionlabel='name']")
	  WebElement drpdownsales;
	  
	  public WebElement clickdrpdownsales() {
		  return drpdownsales;
	  }
	  @FindBy(xpath="//span[text()='Invoicing']")
	  WebElement txtInvoicing;
	  
	  public WebElement clickInvoicing() {
		  return txtInvoicing;
	  }
	  
	  @FindBy(xpath="//input[@placeholder='Search by Item No., Barcode...']")
		WebElement btnBarcode;

		public WebElement clickBarcodeItemNo() {
			return btnBarcode;
		}

	  @FindBy(xpath = "//*[text()='New']")
		WebElement btnNewInvoice;


		public WebElement clickAddNewInvoicing() {
			
			return btnNewInvoice;
		}
		
		@FindBy(xpath="//span[normalize-space()='Invoicing']")
         WebElement txtaddNew2;
		
		public WebElement clickAdd2() {
			return txtaddNew2;
		}
		@FindBy(xpath = "//input[@placeholder='Search Account...']")
		WebElement txtSearchAccount;

		public WebElement setSearchAccount() {
			return txtSearchAccount;
		}
		
		@FindBy(xpath="(//tr)[24]")
		WebElement txtselectAdd;
		
		public WebElement clickselectAdd() {
			return txtselectAdd;
		}
		
		 @FindBy(xpath="//span[contains(text(),'Select Shipping Term')]")
		   WebElement btnShippingTerm;
		   
		   public WebElement clickShippingTerm() {
			   return btnShippingTerm;
		   }
		   
		   @FindBy(xpath="//li[@role='option']")
		   WebElement btnPrepaid;
		   
		   public WebElement clickshippingtermoption() {
			   return btnPrepaid;
		   }
		   
		   
		   @FindBy(xpath="//span[contains(text(),'Select Sales Rep')]")
		   WebElement btnSalesRep;
		   
		   public WebElement clickSalesRep() {
			   return btnSalesRep;
		   }
		   @FindBy(xpath="(//li[@role='option']//span[1])[16]")
		   WebElement btnPan;
		   
		   public WebElement clickPanc() {
			   return btnPan;
		   }
		   
		  
		   @FindBy(xpath="//table[@role='table']//thead//tr//th//span//i")
		   WebElement btnAddProductList;
		   
		   public WebElement clickAddProductList() {
			   return btnAddProductList;
		   }
		   
		   @FindBy(xpath="//input[@placeholder='Global Search']")
		   WebElement txtGlobalSearch;
		   
		  public WebElement clickGlobalSearch() {
			
			return txtGlobalSearch;
		}
		  @FindBy(xpath="(//tbody)[3]//tr[1]")
		  WebElement btnClickProduct;
		  
		  public WebElement clickProductitem() {
			  return btnClickProduct;
		  }
		  @FindBy(xpath="//span[normalize-space()='Add']")
		  WebElement btnAdd;
		  
		  public WebElement clickAddBtn() {
			  return btnAdd;
		  }

		  @FindBy(xpath="//button[@label='Save']")
		  WebElement btnSave;
		  
		  
		  public WebElement clickSubmit() {
			  return btnSave;
		  }
		  @FindBy(xpath="//tbody/tr[1]/td[1]")
		  WebElement btnInvoiceList;
		  public WebElement clickInvoiceList() {
			  return btnInvoiceList;
		  }
		  @FindBy(xpath="//span[contains(text(),'Edit')]")
		  WebElement clickEditBtn;
		  public WebElement clickEditInvoicing() {
			  return clickEditBtn;
		  }
		  @FindBy(xpath="//span[contains(text(),'View')]")
		  WebElement clickViewBtn;
		  public WebElement clickViewInvoicing() {
			  return clickViewBtn;
		  }
		    
		  @FindBy(xpath = "//span[text()='Cancel']")
		    WebElement btnCancel;

		    public WebElement clickCancel() {
			return btnCancel;
		    }
		    @FindBy(xpath="//li[@role='option'][1]")
			  WebElement txtEditNewAcc;
			  
			  public WebElement clickEditNewAcc() {
				  return txtEditNewAcc;
			  }
			  @FindBy(xpath="(//tbody//tr[1])[2]")
			  WebElement txtProductList;
			  
			  public WebElement clickProductList() {
				  return txtProductList;
			  }

				@FindBy(xpath="//span[normalize-space()='Save']")
				WebElement txtSave;
				
				public WebElement clickSaveBtn1() {
					return txtSave;
				}
				@FindBy(xpath="//span[contains(text(),'Yes')]")
				WebElement txtYes;
				
				public WebElement clickYes() {
					return txtYes;
				}
				@FindBy(xpath="(//span[contains(text(),'Delete')])[1]")
				WebElement txtDelete;
				
				public WebElement clickDelete() {
					return txtDelete;
				}
				 @FindBy(xpath = "//input[@placeholder='Search']")
					WebElement txtSearch;

					public WebElement setSearch() {
						return txtSearch;
					}
					
					@FindBy(xpath="//span[contains(text(),'Move to Completed')]")
					WebElement txtmovetocomplete;
					
					public WebElement setMoveToComplete() {
						return txtmovetocomplete;
					}
					
					@FindBy(xpath="//span[contains(text(),'Receive Payments')]")
					WebElement txtreceivedPayment;
					
					public WebElement setReceivedPayment() {
						return txtreceivedPayment;
					}
					
					@FindBy(xpath="(//input[@id='withoutgrouping'])[1]")
					WebElement txtPayemnt;
					
					public WebElement setReceivePayment2() {
						return txtPayemnt;
					}
					@FindBy(xpath="(//span[contains(text(),'Void')])[1]")
					WebElement txtVoidEstimate;
					
					public WebElement clickVoid() {
						return txtVoidEstimate;
					}
					 @FindBy(xpath="(//span[contains(text(),'Active')])[1]")
					 WebElement txtActive;
					 
					 public WebElement clickInActive() {
						 return txtActive;
					 }
					 @FindBy(xpath="(//span[contains(text(),'InActive')])[1]")
					 WebElement txtInActive;
					 
					 public WebElement clickActive() {
						 return txtActive;
					 }
					 
					 @FindBy(xpath="//span[normalize-space()='Completed']")
					 WebElement setOrderStatus;
					 
					 public WebElement clickOrderStatus() {
						 return setOrderStatus;
					 }
					 
					 @FindBy(xpath="//li[@aria-label='Hold']")
					 WebElement txthold;
					 
					 public WebElement clickhold() {
						 return txthold;
					 }
					 
					 @FindBy(xpath="//span[contains(text(),'Default Channel')]")
					 WebElement txtDefaultChannel;
					 
					 public WebElement clickDefaultChannel() {
						 return txtDefaultChannel;
					 }
					 @FindBy(xpath="(//span[contains(text(),'Integration')])")
					 WebElement txtIntegration;
					 
					 public WebElement clickIntegration() {
						 return txtIntegration;
					 }
	                @FindBy(xpath="//span[contains(text(),'Automation')]")
	                WebElement txtautomation;
	                
	                public WebElement clickAutomation() {
	                	return txtautomation;
	                }
	                @FindBy(xpath="//span[contains(text(),'Select Payment Method')]")
	                WebElement txtSelectPaymentMethod;
	                
	                public WebElement clickSelectPaymentMethod() {
	                	return txtSelectPaymentMethod;
	                }
	                
	                @FindBy(xpath="//span[contains(text(),'Cash')]")
	                WebElement txtcash;
	                
	                public WebElement clickCash() {
	                	return txtcash;
	                }
                      @FindBy(xpath="//div[contains(text(),'Customer')]//p-checkbox[1]")
                      WebElement clickcustomer;
                      
                      public WebElement clickcustomer() {
                    	  return clickcustomer;
                      }
                      @FindBy(xpath="//input[@formcontrolname='shippingChargeAmount']")
                      WebElement setShippingChargeValue;
                      
                      public WebElement SetShippingChargeValue() {
                    	  return setShippingChargeValue;
                      }
                      @FindBy(xpath="//p-dropdown[@optionlabel='code']//div[@aria-label='dropdown trigger']//span")
     				 WebElement txtTaxTrigger;
     				 
     				 public WebElement setTax() {
     					 return txtTaxTrigger;
     				 }
     				 
     				 @FindBy(xpath="(//span[contains(text(),'Tax 5%')])[2]")
     				 WebElement setTax5percent;
     				 
     				 public WebElement setFivePercent(){
     					 return setTax5percent;
     				 }
     				 @FindBy(xpath="//input[@formcontrolname='discountValue']")
     				 WebElement txtDiscountValue;
     				 
     				 public WebElement setDiscountValue() {
     					 return txtDiscountValue;
     				 }
     				 
     				 @FindBy(xpath="//textarea[@placeholder='Vendor Message']")
     				 WebElement setVendorMessage;
     				 
     				 public WebElement SetVendorMessage() {
     					 return setVendorMessage;
     				 }
     				@FindBy(xpath="(//div[@class='activity-content'])[1]")
     				WebElement SalesInvoice;
     				
     				public WebElement showInvoice() {
     					return SalesInvoice;
     				}
     				 @FindBy(xpath="(//div[@class='card']//span/p)[1]")
     				 WebElement verifyInvoicingAccName;
     				 
     				 public WebElement verifyInvoicingAccName() {
     					 return verifyInvoicingAccName;
     				 }
     				 @FindBy(xpath="(//div[@class='card']//span/p)[1]")
     				 WebElement verifyOverviewInvoicingAccName;
     				 
     				 public WebElement VerifyOverviewInvoicingAccName() {
     					 return verifyOverviewInvoicingAccName;
     				 }
     				 @FindBy(xpath="(//div[@class='card']/p/span)[1]")
     				 WebElement verifyInvoiceDate;
     				 
     				 public WebElement VerifyInvoicedate() {
     					 return verifyInvoiceDate;
     				 }
     				 @FindBy(xpath="(//div[@class='card']/p/span)[1]")
     				 WebElement verifyInvoiceOverviewDate;
     				 
     				 public WebElement VerifyOverviewinvoiceDate() {
     					 return verifyInvoiceOverviewDate;
     				 }
     				 @FindBy(xpath="(//p)[13]")
     				 WebElement verifyOverviewinvoiceStatus;
     				 
     				 public WebElement VerifyOverviewinvoiceStatus() {
     					 return verifyOverviewinvoiceStatus;
     					 
     				 }
     				 @FindBy(xpath="(//p)[13]")
     				 WebElement verifyinvoiceStatus;
     				 
     				 public WebElement VerifyinvoiceStatus() {
     					 return verifyinvoiceStatus;
     				 }
     				 @FindBy(xpath="(//div[@class='card']//p)[20]")
     				 WebElement verifyInvoiceOverviewShippingMethod;
     				 
     				 public WebElement VerifyInvoiceOverviewShippingMethod()
     				 {
     					 return verifyInvoiceOverviewShippingMethod;
     				 }
     				 @FindBy(xpath="(//div[@class='card']//p)[20]")
     				 WebElement verifyInvoiceShippingMethod;
     				 
     				 public WebElement VerifyinvoiceShippingMethod() {
     					 return verifyInvoiceShippingMethod;
     				 }
     				 @FindBy(xpath="(//div[@class='card']//p)[21]")
     				 WebElement verifyInvoicesalesRep;
     				 public WebElement VerifyInvoicesalesrep() {
     					 return verifyInvoicesalesRep;
     				 }
     				 @FindBy(xpath="(//div[@class='card']//p)[21]")
     				 WebElement verifyOverviewInvoicesalesRep;
     				 
     				 public WebElement VerifyOverviewInvoicesalesRep() {
     					 return verifyOverviewInvoicesalesRep;
     				 }
     				 
     				 @FindBy(xpath="(//div[@class='card']//p)[19]")
     				 WebElement verifyOverviewInvoicePaymentMethod;
     				 
     				 public WebElement VerifyOverviewInvoicePaymentMethod() {
     					 return verifyOverviewInvoicePaymentMethod;
     				 }
     				 
     				 @FindBy(xpath="(//div[@class='card']//p)[19]")
     				 WebElement verifyInvoicePaymentMethod;
     				 
     				 public WebElement VerifyInvoicePaymentMethod() {
     					 return verifyInvoicePaymentMethod;
     				 }
     				 
     				 @FindBy(xpath="(//div[@class='card']//p)[18]")
     				 WebElement verifyInvoicePaymentTerm;
     				 
     				 public WebElement VerifyInvoicePaymentTerm() {
     					 return verifyInvoicePaymentTerm;
     					 
     				 }
     				 @FindBy(xpath="(//div[@class='card']//p)[18]")
     				 WebElement verifyOverviewInvoicePaymentTerm;
     				 
     				 public WebElement VerifyOverviewInvoicePaymentTerm() {
     					 return verifyInvoicePaymentTerm;
     					 
     			}
     				 
     				 @FindBy(xpath="//div[@class='card']/text()")
     				 WebElement verifyInvoiceshippingterm;
     				 
     				 public WebElement Verifysalesshippingterm() {
     					 return verifyInvoiceshippingterm;
     					 
     				 }

     				
}



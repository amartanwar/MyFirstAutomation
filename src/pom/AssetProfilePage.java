package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import generic.SystemDate;

public class AssetProfilePage extends BasePage
{
	@FindBy(id="ctl00_F_PH_txtUnitNumber")
	private WebElement unitNumber;
	
	@FindBy(id="ctl00_F_PH_txtUnitNumber")
	private WebElement acquiredDate;
	
	@FindBy(id="ctl00_F_PH_cboInventoryTypeID_cboComboBoxControl")
	private WebElement type;
	
	@FindBy(id="ctl00_F_PH_cboUsageConditionID_cboComboBoxControl")
	private WebElement usageCondition;
	
	@FindBy(id="ctl00_F_PH_txtAccountNumber")
	private WebElement accountNumber;
	
	@FindBy(id="ctl00_F_PH_txtFactorCategoryID")
	private WebElement factorCategory;
	
	@FindBy(id="ctl00_F_PH_cboContract_cboComboBoxControl")
	private WebElement contractNumber;
	
	@FindBy(id="ctl00_F_PH_cboDivision_cboComboBoxControl")
	private WebElement divisionNumber;
	
	@FindBy(id="ctl00_F_PH_cboSubDivision_cboComboBoxControl")
	private WebElement subDivisionNumber;
	
	@FindBy(id="igtxtctl00_F_PH_txtLocation")
	private WebElement locationCode;
	
	@FindBy(id="ctl00_F_PH_txtLocationEffectiveFromDate_input")
	private WebElement effectiveDate;
	
	@FindBy(id="ctl00_F_PH_GLSegmentAssignment_grdGLSegmentAssignment_ci_0_3_0_cboSegmentValue")
	private WebElement company;
	
	@FindBy(id="ctl00_F_PH_GLSegmentAssignment_grdGLSegmentAssignment_ci_0_3_1_cboSegmentValue")
	private WebElement department;
	
	@FindBy(id="ctl00_Fr_PH_cmdSave_cmdButtonControl")
	private WebElement saveButton;
	
	@FindBy(id="ctl00_Fr_PH_cmdClose_cmdButtonControl")
	private WebElement closeButton;
	
	@FindBy(id="ctl00_Fr_PH_cmdSave_cmdButtonControl")
	private WebElement assetVehicleDetailsSaveButton;

	public AssetProfilePage(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void setUnitNumber(String un)
	{
		unitNumber.sendKeys(un);
	}
	
//	public void setAcquiredDate(String date)
//	{
//		unitNumber.sendKeys(date);
//	}
	
	public void setAcquiredDate()
	{
		unitNumber.sendKeys("6-18-2017");
	}
	
	public void setAssetType(String assetType)
	{
		Select se =new Select(type);
		se.selectByVisibleText(assetType);
		
	}
	
	public void setUsageCondition(String AssetUsageCondition)
	{
		Select se= new Select(usageCondition);
		se.selectByVisibleText(AssetUsageCondition);
	}
	
	public void setAccountNumber(String acNumber)
	{
		accountNumber.sendKeys(acNumber);
	}
	
	public void setFactorCategory(String fcCategory)
	{
		factorCategory.sendKeys(fcCategory);
	}
	
	public void setContractNumber(String conNumber)
	{
		Select se= new Select(contractNumber);
		se.selectByVisibleText(conNumber);
	}
	
	public void setDivision(String divNumber)
	{
		Select se= new Select(divisionNumber);
		se.selectByVisibleText(divNumber);
	}
	
	public void setSubdivision(String subdivNumber)
	{
		Select se= new Select(subDivisionNumber);
		se.selectByVisibleText(subdivNumber);
	}
	
	public void setLocationCode(String locCode)
	{
		locationCode.sendKeys(locCode);
	}
	
	public void setEffectiveDate()
	{
		effectiveDate.sendKeys(SystemDate.date);
	}
	
	
	public void setCompany(String companyName)
	{
		Select se= new Select(company);
		se.selectByVisibleText(companyName);
	}
	
	public void setDepartment(String AssetUsageCondition)
	{
		Select se= new Select(department);
		se.selectByVisibleText(AssetUsageCondition);
	}
	
	public void clickOnSave()
	{
		saveButton.click();
	}
	
	public void clickOnClose()
	{
		closeButton.click();
	}
	
	public void clickOnVehicleDetailsSaveButton()
	{
		assetVehicleDetailsSaveButton.click();
	}
	
	
	
}

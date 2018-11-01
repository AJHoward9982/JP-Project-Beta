/**
 * Andrew Howard
 *
 * ENUM for the different display types
 */
public enum ItemType {
  Audio("AU"), AudioMobile("AM"), Visual("VI"), VisualMobile("VM");

  public String code;

  ItemType(String item) {
    this.code = item;
  }


}

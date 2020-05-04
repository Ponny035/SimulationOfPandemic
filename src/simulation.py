import pygame
pygame.init()
img = pygame.image.load("maps-and-flags.png").convert()
display = pygame.display.set_mode((400,400))
display.blit(img,[0,0])
pygame.display.update()